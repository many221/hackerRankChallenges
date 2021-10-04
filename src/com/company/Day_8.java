package com.company;

import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Day_8 {
    //Complete this code or write your own from scratch


    class Solution{

        public static void main(String []argh){

            Scanner in = new Scanner (System.in);

            int n = in.nextInt();

            HashMap<String,Integer>hmap = new HashMap<String, Integer> ();

            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                hmap.put ( name, phone );

            }

            while(in.hasNext()){
                String s = in.next();
                // Write code here
                boolean flag = hmap.containsKey ( s );
                if(flag){
                    System.out.println (s +"=" + hmap.get ( s ));
                }else System.out.println ("Not found");


            }
            in.close();
        }
    }
}
