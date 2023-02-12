package com.sakthi.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(6.2, 7.5, 2.6);
//        Box box2 = new Box(box1);
//        System.out.println(box1.length + " " + box1.width + " " + box1.height);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(13.5,12,10.5,45);
//        System.out.println(box3.height + " " + box3.weight);

        Box box5 = new BoxWeight(2,3,5,6);
        System.out.println(box5.width);

        Box box6 = new Box(2,3,5);
        System.out.println(box6.width);
    }
}
