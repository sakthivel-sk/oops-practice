package com.sakthi.introduction;

import java.lang.Object;

public class WrapperExamples {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45;
        Integer a = 25;
        Integer b = 45;

        swap(a,b);
        System.out.println(a + " " + b);
        final A sakthi = new A("Sakthivel S");
        sakthi.name = "Other name";

        //when a non primitive is final, cannot reassign it.
//        sakthi = new A("new object");
        A obj = new A("Asddsfsfsfc");
        System.out.println(obj);

//
//        for (int i = 0; i < 10; i++) {
//            obj = new A("Random name"); }
    }

    static void swap(Integer a, Integer b)
    {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A {
    final int sum = 95;
    String name;

    public A(String name) {
     //   System.out.println("Object is created");
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}