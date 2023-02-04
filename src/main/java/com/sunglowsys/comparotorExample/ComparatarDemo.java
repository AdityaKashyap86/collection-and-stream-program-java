package com.sunglowsys.comparotorExample;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatarDemo {
    public static void main(String[] args) {
    ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp(1,"shyam","ahsga"));
        emps.add(new Emp(23,"mohan","sshjA"));
        emps.add(new Emp(12, "abhishek","jdd"));
        System.out.println(emps);
        Collections.sort(emps, new AdddressComparator());
        System.out.println(emps);


    }
}
