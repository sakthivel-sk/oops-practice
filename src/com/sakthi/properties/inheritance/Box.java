package com.sakthi.properties.inheritance;

public class Box {
    double length, height, width;

    Box() {
        this.height = 5;
        this.length = 5;
        this.width  = 5;
    }

    Box (double length,double height, double width) {
        this.length = length;
        this.height  = height;
        this.width = width;
    }

    Box(double old) {
        this.length = old;
        this.height = old;
        this.width = old;
    }
    Box(Box old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
