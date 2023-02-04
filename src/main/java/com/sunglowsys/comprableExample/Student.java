package com.sunglowsys.comprableExample;

public class Student  implements Comparable<Student>{

    private int stuId;
    private String name;
    private Long mobile;

    public Student(int stuId, String name, Long mobile) {
        this.stuId = stuId;
        this.name = name;
        this.mobile = mobile;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.stuId-o.stuId;
    }
}
