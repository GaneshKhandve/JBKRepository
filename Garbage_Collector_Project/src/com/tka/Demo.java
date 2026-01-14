package com.tka;

public class Demo {
    int a;
    String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println("a: " +a + " b: " +b);
    }

    @Override
    protected void finalize()  {
        System.out.println("Demo object deleted");
    }
}

