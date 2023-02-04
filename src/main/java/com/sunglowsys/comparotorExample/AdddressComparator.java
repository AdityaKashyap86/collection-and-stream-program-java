package com.sunglowsys.comparotorExample;

import java.util.Comparator;

public class AdddressComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
