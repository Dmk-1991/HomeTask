package com.dmk.HomeTask3;

/**
 * Created by Михаил on 01.11.2014.
 */
public class MyArray {
    public static void main(String[]args){
        int [][] array=new int[5][8];
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<8;j++) {
                array[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();

        }
    }
}






