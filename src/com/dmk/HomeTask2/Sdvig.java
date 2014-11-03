package com.dmk.HomeTask2;

/**
 * Created by Михаил on 01.11.2014.
 */
class Parametr {
     long properties;
     void setParam(int shift, int value){
        long mask=0xFFFF;
        mask<<=shift;
        mask=~mask;
        properties&=mask;

        long a=(short) value;
        a=a<<shift;
        properties=a|properties;
    }

    void setYear(int year){
      setParam(48,year);
     }
    void setWeight(int weight){
    setParam(32,weight);
    }
   void setAge(int age){
       setParam(16,age);
   }
   void setHight(int hight){
       setParam(0,hight);
   }
   int getParam(int shift){
       long mask1=0xFFFF;
       long property=properties>>>shift;
       property&=mask1;
       return (int)property;
   }
   int getAge(){
       return getParam(16);
   }
   int getYear(){
      return getParam(48);
   }
int getWight(){
   return getParam(32);
   }
   int getHight(int i){
       return getParam(0);
   }
}
public class Sdvig{
    public static void main(String[]args){
        Parametr ht=new Parametr();
        ht.setYear(1991);
        ht.setAge(22);
        ht.setHight(180);
        ht.setWeight(70);
        System.out.println(ht.getAge());

    }
}


