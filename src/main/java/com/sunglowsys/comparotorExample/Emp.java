package com.sunglowsys.comparotorExample;

public class Emp {

    private int empId;
    private String name;
    private String address;




    public Emp(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
