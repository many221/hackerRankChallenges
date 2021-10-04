package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Day_7 {


    public static Scanner input = new Scanner ( System.in );

    public static void reverseArr(){

        int n = input.nextInt ();

        int[] numberSet = new int[n];

      //  System.out.println ("------");
        for (int i = 0; i < n; i++) {

            int num = input.nextInt ();

            numberSet[i] = num;

            if(i == n - 1){

                String numbers = "";

                for(int j = i; j >= 0; j--){

                    numbers += numberSet[j] + " ";

                }

                 numbers = numbers.trim ();

                System.out.println (numbers);

            }

        }



    }

    public static void main(String[] args) {
reverseArr ();
    }
}
