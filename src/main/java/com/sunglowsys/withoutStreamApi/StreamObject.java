package com.sunglowsys.withoutStreamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        Stream<Object> emptyStream = Stream.empty();

        List<String> name = List.of("aditya", "kashyap", "rahakd", "aman", "shyam");
        List<String> newStram = name.stream().filter(e -> e.startsWith("r")).collect(Collectors.toList());
        System.out.println(newStram);



        List<Integer> numbers = List.of(2,3,23,4,2,4,5,3,1);
        List<Integer> newInteger = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newInteger);


        /*List<String> newList = name.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
        System.out.println(newList);
      */
        /*Stream<String> name1 = Stream.of(name);
        name1.forEach( e -> {
            System.out.println(e);
        });*/

    }
}
