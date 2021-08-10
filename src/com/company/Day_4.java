package com.company;

import java.time.Period;

public class Day_4 {

    static class  Person{

        private int age;

        public Person(int initialAge){

           if (initialAge > 0){

               this.age = initialAge;}

           else{

               System.out.println ("Age is not valid, setting age to 0.");

               this.age = 0;
           }
        }

        public void amIOld(){

            if (age < 13) {

                System.out.println ("You are young.");

            } else if (age >= 13 && age < 18){

                System.out.println ("You are a teenager.");

            } else {
                System.out.println ("You are old.");
            }



        }

        public void yearPasses(){

            age ++;

        }

    }
    public static void main(String[] args) {

        Person person1 = new Person ( -2 );

        person1.amIOld ();
        person1.yearPasses ();
        System.out.println (person1.age);


    }
}
