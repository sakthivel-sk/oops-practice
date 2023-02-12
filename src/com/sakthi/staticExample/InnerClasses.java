package com.sakthi.staticExample;

public class InnerClasses {
   static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

       @Override
       public String toString() {
           return "Test{" +
                   "name='" + name + '\'' +
                   '}';
       }
   }

    public static void main(String[] args) {
        Test a = new Test("Sakthi");
        Test b = new Test("Sakthivel");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
