package com.sakthi.properties.polymorphism;

public class Circle extends Shapes {
    @Override
    void area() {
        System.out.println("Area is pie * r * r");
    }
}
