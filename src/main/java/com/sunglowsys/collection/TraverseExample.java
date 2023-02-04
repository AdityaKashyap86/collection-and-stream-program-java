package com.sunglowsys.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("aditya");
        names.add("amit");
        names.add("rohan");
        names.add("shyam");

        // by using the for each loop iterate elements...
        for (String str:names) {
            System.out.println(str+"\t"+str.length()+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

        System.out.println("-------------------------------");

        //By using Iterator: forward direction
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
           // String next = itr.next();
            System.out.println(itr.next());
        }
    }
}