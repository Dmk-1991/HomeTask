package com.dmk.HomeTask3;

/**
 * Created by Михаил on 31.10.2014.
 */
 public class Tramvai {
    public static void main(String[] args) {
        byte a;
        int bilet;
        byte c;
        int priz = 0;
        for (bilet = 1; bilet < 1000000; bilet++) {
            byte first3 = 0;
            byte last3 = 0;
            int nomerLast = bilet;
            for (a = 0; a < 3; a++) {
                last3 = (byte) (last3 + (nomerLast % 10));
                nomerLast /= 10;
            }
            int nomerFirst = bilet / 1000;
            for (c = 0; c < 3; c++) {
                first3 = (byte) (first3 + (nomerFirst % 10));
                nomerFirst /= 10;
            }
            if (last3 == first3) priz++;
        }
        System.out.println("Количество призов нужное для акции  "+priz);


    }
}







