package com.tka.exception11dec2025;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Start of Main Method");
        try {
            System.out.println("In try Block");
            System.out.println(4/0);
        } catch (ArithmeticException e){
            System.out.println("In catch Block");
            System.out.println("Cannot divided by Zero");
        }
        finally {
            System.out.println("Finally This block is always executed");
        }
    }
}
