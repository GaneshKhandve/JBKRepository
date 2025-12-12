package com.tka.dec9;

public class StringExample {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 ="Hello";

        System.out.println(s1 == s1.intern());
        System.out.println(s1.equals(s1.intern()));
        System.out.println(s1==s2);
        System.out.println(s1.intern() == s2);

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        sb.append("Ganesh");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        System.out.println(sb.toString());

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append("World");
        System.out.println(sb1);
        System.out.println(sb1.toString());




    }
}
