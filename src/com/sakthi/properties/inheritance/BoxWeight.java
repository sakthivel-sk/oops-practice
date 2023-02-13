package com.sakthi.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = 12;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);

      //  System.out.println(this.weight);
        this.weight = weight;
    }
}
