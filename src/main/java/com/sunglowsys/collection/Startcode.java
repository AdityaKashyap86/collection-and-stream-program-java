package com.sunglowsys.collection;
import java.util.*;

    //Creating class name Statcode.

public class Startcode {

    //creating main method
    public static void main(String[] args) {
        System.out.println("This is the java collection...");

        //type safe created ArrayList collection in java
        ArrayList<String> names = new ArrayList<>();

        //adding elements in collection safe type As a String name...
        names.add("aditya");
        names.add("amit");
        names.add("rohan");
        names.add("shyam");

        //printing element
        System.out.println(names);

        //removing elements what will you give"" name
        names.remove("rohan");

        //Again print elements...
        System.out.println(names);

        //It's checking the elements name there is available or not
        System.out.println(names.contains("amit"));

        //representing the size whole elements
        System.out.println(names.size());

        names.set(2,"shivam kashyap");

        System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);

        System.out.println("Vector Elements"+names);


        //un Type safe created collection in java you add different type variable store As a string, int and double...2
         ArrayList list = new ArrayList();
             list.add(23);
             list.add("prsdadf");

        System.out.println("---------------new Set----------------");

        HashSet<Double> hs = new HashSet<>();
        hs.add(23.12);
        hs.add(34.21);
        hs.add(42.234);
        hs.add(11.23);
        hs.add(233.234);
        System.out.println(hs);

        TreeSet<Double> ts = new TreeSet<>();
        ts.add(34.21);
        ts.add(42.234);
        ts.add(11.23);
        ts.add(233.234);
        System.out.println(ts);
    }
}
