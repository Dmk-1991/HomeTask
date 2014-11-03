package com.dmk.HomeTask3;

//Перепутал, и посчитал для простых чисел(которые делятся на 1 и сами на себя, только).
import java.util.Scanner;

class Algorithm{
     int setParam(int n){
        if ((n==2)||(n==3)||(n==5))
             return n;
         if((n%2==0)||(n%3==0)||(n%5==0)){
            return  setParam(n+1);
         }
         else{
             return n;
         }
     }
}
public class Recusion3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        Algorithm obj=new Algorithm();
        for (int ht=2;ht<number;ht++){
            System.out.print(obj.setParam(ht)+" ");
        ht=obj.setParam(ht);
        }
    }
}
