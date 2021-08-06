package com.company;

import java.util.Scanner;

/* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

public class Day_1 {
    
 
   static Scanner input = new Scanner(System.in);
 
  public static void main(String[] args) {
    
    
        int i = 4;
        double d = 8.0;
        String s = "The input was ";

        System.out.println("Enter interger ");
         int i2 = input.nextInt();
         System.out.println("Enter Double ");
         double d2 = input.nextDouble();
         input.nextLine ();
         System.out.println("Enter String ");
         String s2 = input.nextLine();

         System.out.println(i + i2);
         System.out.println(d + d2);
         System.out.println(s + s2);


    }

  

    

}
