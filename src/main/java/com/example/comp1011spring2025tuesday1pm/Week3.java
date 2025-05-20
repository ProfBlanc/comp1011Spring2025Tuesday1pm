package com.example.comp1011spring2025tuesday1pm;

import java.util.ArrayList;
import java.util.stream.IntStream;
public class Week3 {

    public static void main(String[] args) {
        /*
            List of Values

            Stream

            Using a Stream and Lambda Expressions

            Functional app/output


         */

        //get the sum of int values from 1 to 10
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("The sum of 1 to 10 is: " + sum);

        int sum1 = IntStream.range(1, 11).sum();
        System.out.println("The sum of 1 to 10 is: " + sum1);


        ArrayList<String> names = new ArrayList<>();
        names.add("Ben");
        names.add("Jane");
        names.add("John");
        names.add("Jacob");
        names.add("James");
        names.add("Joshua");
        names.add("Jessica");
        names.add("Jennifer");
        names.add("Joseph");

        names.stream()
                .filter(name -> name.contains("e"))
                .map(String::toUpperCase)
                //.forEach(s-> System.out.println(s));
                .forEach(System.out::println);


    }
}
