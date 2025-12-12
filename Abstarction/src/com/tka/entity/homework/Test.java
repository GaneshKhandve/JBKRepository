package com.tka.entity.homework;

public class Test {
    public static void main(String[] args) {
        //Task 1
        A obj1 = new A();
        System.out.println(obj1.p);
        System.out.println(obj1.q);
        //System.out.println(obj1.r);  error not define
        obj1.m1();
        obj1.m2();
       // obj1.m3(); error not define
        System.out.println("First Task Output End");
        //Task 2
        B obj2 = new B();
        System.out.println(obj2.p);
        System.out.println(obj2.q);
        System.out.println(obj2.r);
        obj2.m1();
        obj2.m2();
        obj2.m3();
        System.out.println("Second Task Output End");
        //Task 3
        A obj3 = new B();
        System.out.println(obj3.p);
        System.out.println(obj3.q);
       // System.out.println(obj3.r); error
        obj3.m1();
        obj3.m2();
        //obj3.m3(); error

        System.out.println("Third Task Output End");

        //Task4

        A obj4 = new A();
        B obj5 = new B();

       // obj5= obj4; it gives error
        obj4 = obj5;

        System.out.println(obj4.p);
        System.out.println(obj4.q);
       // System.out.println(obj4.r); error
        obj4.m1();
        obj4.m2();
       // obj4.m3(); error




    }
}
