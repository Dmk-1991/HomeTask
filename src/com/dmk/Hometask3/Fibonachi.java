package com.dmk.HomeTask3;

public class Fibonachi{
    public static  void main(String[]args){
int a,b=2,c;
       for(a=1;a<2;a++)
           System.out.print(a);
        for(a=1;a<2;a++)
            System.out.print(" "+a);
c=1;
a=1;
        for(b=0;b<9;b++){
            c=c+a;
            System.out.print(" "+c);
            a=c-a;
        }

     }
}

