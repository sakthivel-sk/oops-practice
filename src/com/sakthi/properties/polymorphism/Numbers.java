package com.sakthi.properties.polymorphism;

public class Numbers {

    int sum (int a, int b) {
        return a+b;
    }

    double sum (double a, double b, double c) {
        return a+b+c;
    }
    int sum (int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(85,78));
        System.out.println(obj.sum(100,114, 20));
        System.out.println(obj.sum(12.5,15.75,45.25));
    }
}
