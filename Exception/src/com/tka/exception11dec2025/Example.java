package com.tka.exception11dec2025;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int anInt1 = scanner.nextInt();

        try {
            int num = anInt1;
            System.out.println("You entered " +num);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Invalid Input");
        }



        System.out.println("Start Of main Method");
        System.out.println(4 / 6);
        System.out.println(4 / 2);
        int[] arr = {1, 2, 4, 5};

        try {
            System.out.println(4 / 0);
            String s = "Ganesh";
            System.out.println(s.charAt(10));
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            //      e.printStackTrace();
            // System.out.println(e);
            //  System.out.println("Caught an ArithmeticException" +e.getMessage());
            // System.out.println("Can not divide By Zero");
            System.out.println("Infinity");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out of String Index exception" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of array Index " + e.getMessage());
        }

        System.out.println(4 / 3);
        System.out.println("End of Main method");
    }
}
