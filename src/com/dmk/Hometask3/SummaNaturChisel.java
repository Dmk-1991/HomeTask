package com.dmk.HomeTask3;

import java.util.*;

/**
 * Created by Михаил on 31.10.2014.
 */
public class SummaNaturChisel {
    public static void main(String[]args){
    int sum=0;
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
        while(n!=0){
            sum=sum+(n%10);
        n/=10;}

        System.out.print(sum);

}}
