package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

 public class Day_2{

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here

        //(tipP/100) x meal = tip
        //(taxP/100) x meal = tax
        //meal + tip + tax = totalCost
        double tip = meal_cost *  tip_percent/100;

        double tax =  meal_cost *  tax_percent/100;

        int totalCost = (int) (meal_cost + tip + tax);
        System.out.println (totalCost);
    }


    public static void main(String[] args)  {

        Scanner input = new Scanner ( System.in );

        double meal_cost = input.nextDouble ();

        int tip_percent = input.nextInt ();

        int tax_percent = input.nextInt ();

        Day_2.solve(meal_cost, tip_percent, tax_percent);

    }
}