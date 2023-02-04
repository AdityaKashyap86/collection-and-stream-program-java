package com.sunglowsys.withoutStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
                //Creating class Even Odd number related...
public class EvenList {

                //Creating main method
    public static void main(String[] args) {

                // Creating list
        List<Integer> list1 = List.of(1,3,23,133,1233,3,2,4,245,32,42);
       // list1.add(223);

        System.out.println(list1);

                //Creating Even and odd name ArrayList to store the even and store element inside it....
        List<Integer> ListEven = new ArrayList<>();
        List<Integer> ListOdd = new ArrayList<>();

                //We are using on here forEach loop bcz to give condition.... And This condition to Even Number
        for (Integer i : list1) {
            if (i % 2 == 0) {
                ListEven.add(i);
               // System.out.println("even number is :"+ i);
            }
        }
        System.out.println(ListEven);

                 // this condition odd number
        for (Integer i : list1) {
            if (i % 2 != 0) {
                ListOdd.add(i);
            }
        }
        System.out.println(ListOdd);

        System.out.println("---------By using stream api------------");

        //By using stream api perform even number program in java
        List<Integer> streamList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(streamList);

        //By using stream api perform odd number in java
        List<Integer> stream2 = list1.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(stream2);

        //By using stream api we are performing less than 10 program in java
        List<Integer> stream3 = list1.stream().filter(i -> i < 10).collect(Collectors.toList());
        System.out.println(stream3);
    }
}
