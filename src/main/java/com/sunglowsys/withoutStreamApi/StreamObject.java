package com.sunglowsys.withoutStreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        Stream<Object> emptyStream = Stream.empty();

        List<String> name = List.of("D", "B", "C", "E", "A");
        List<String> newStram = name.stream().filter(e -> e.startsWith("r")).collect(Collectors.toList());
        //System.out.println(newStram);

        //Traverse name list by using for loop...

        name.stream().forEach( e -> {
            System.out.println(e);
        });

        System.out.println("-------------------------------------------------------");

         // sorted this with using stream object...

        List<String> newSorted = name.stream().sorted().collect(Collectors.toList());
        System.out.println(newSorted);


        /*Sorted method by using shortcut print...

        name.stream().sorted().forEach(System.out::println);

        */



        /*This is the shortcut to print name List Object

        name.stream().forEach(System.out::println);

         */

        List<Integer> numbers = List.of(3,23,4,2,5,1);
        System.out.println(numbers);

        /*
        //Sorted number by using sorted method in stream

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);

        */
/*

        //We are reversing that numbers what we had sorted

        List<Integer> reverseNumber = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseNumber);
*/

        //numbers.stream()


        //MiniMun numbers element we want to get...
        Integer intMin = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min number is: "+intMin);

        //MaxiMum number element we want to get...
        Integer intmax = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max number is: "+intmax);


       /* // whole int value square stream...

       List<Integer> newInteger = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newInteger);

        */

       // numbers.stream().sorted().forEach(System.out::println);


        /* find the string WhatEver key you want to choose...

        List<String> newList = name.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
        System.out.println(newList);

        */


        /*

        Stream<String> name1 = Stream.of(name);
        name1.forEach( e -> {
            System.out.println(e);
        });

        */

    }
}
