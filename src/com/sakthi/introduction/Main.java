package com.sakthi.introduction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student sakthi = new Student();
//        sakthi.rollno = 82;
//        sakthi.name = "Sakthivel";
//        sakthi.marks = 82.5f;

        Student random = new Student();

        System.out.println(sakthi.rollno);
        System.out.println(sakthi.name);
        System.out.println(sakthi.marks);

        Student one = new Student();
        Student two = one;
        one.name = "Something something";

        System.out.println(two.name);
    }
}

class Student {
    int rollno;
    String name;
    float marks;
    void greeting() {
        System.out.println("Hello!... My Name is " + this.name);
    }

    Student() {
        this(83, "SakthielS",95.25f);
    }

    Student(int rollno, String name,float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}