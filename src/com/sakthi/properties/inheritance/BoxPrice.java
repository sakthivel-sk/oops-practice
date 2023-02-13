package com.sakthi.properties.inheritance;

public class BoxPrice extends BoxWeight {

    double cost;

    BoxPrice() {
        super();
        this.cost = 30;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double length, double height, double width, double weight, double cost) {
        super(length, height, width, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

}
