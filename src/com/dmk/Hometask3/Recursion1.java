package com.dmk.HomeTask3;

import java.util.Scanner;

class Parametr{
    int recursion(int n){
        if(n<=1)
            return 1;
        else {
        return recursion(n-1)+n;

        }
    }
}
public class Recursion1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        Parametr obj=new Parametr();
        System.out.println(obj.recursion(number));
    }
}
