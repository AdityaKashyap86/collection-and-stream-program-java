package com.sunglowsys.comprableExample;

import java.util.ArrayList;
import java.util.Collections;

public class DemoComparable {
    public static void main(String[] args) {

        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student(2,"sditya",9287398729L));
        stu.add(new Student(12,"kkaddf", 8398784L));
        stu.add(new Student(3,"ahiv", 2837846L));
        System.out.println(stu);
        Collections.sort(stu);
        System.out.println(stu);
    }
}
