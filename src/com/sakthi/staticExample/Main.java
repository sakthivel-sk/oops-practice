package com.sakthi.staticExample;

public class Main {
    public static void main(String[] args) {
        Human sakthi = new Human(24, "Sakthivel-82",30000, false);
        Human deepak = new Human(32, "Deepak",40000, true);

        System.out.println(sakthi.population);
        System.out.println(deepak.population);
    }
}
