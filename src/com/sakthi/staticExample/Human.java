package com.sakthi.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;



    static void message() {
        System.out.println("Helllo World1");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
