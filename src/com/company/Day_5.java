package com.company;

public class Day_5 {


    public static void timesTable(int num){

        for (int i = 1; i <= 10; i++) {
            int sum = num * i;
            System.out.println (num + " x " + i + " = " + sum );
        }

    }



    public static void main(String[] args) {
        timesTable ( 3 );
    }


}
