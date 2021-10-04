package com.company;

import java.util.Scanner;

public class Day_6 {

    public static Scanner input = new Scanner ( System.in );

    public static void stringSep(){


        int T = input.nextInt ();
        input.nextLine ();

        for (int i = 0; i < T; i++) {

        //System.out.println ("Please Enter A String: ");

        String txt = input.nextLine ();

        StringBuilder txt2 = new StringBuilder ( "" );

            for (int j = 0; j < txt.length (); j++) {

            boolean evenOdd = j % 2 == 0;

            if(evenOdd){
                txt2.append (txt.charAt ( j ));
            }

            }

            txt2.append ( "  " );

            for (int j = 0; j < txt.length (); j++) {

                boolean evenOdd = j % 2 == 0;

                if(!evenOdd){
                    txt2.append (txt.charAt ( j ));
                }

            }
            System.out.println (txt2);
        }

    }
    public static void main(String[] args) {
    stringSep ();
    }
}
