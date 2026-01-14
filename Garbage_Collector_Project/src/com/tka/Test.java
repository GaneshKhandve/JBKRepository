package com.tka;

public class Test {
    public static void main(String[] args) {
        Demo d1 = new Demo(10,"Hello");
        Demo d2 = d1;

        d1.display();
        d2.display();

        d1= null;
        d2= null;

        System.gc();
    }
}
