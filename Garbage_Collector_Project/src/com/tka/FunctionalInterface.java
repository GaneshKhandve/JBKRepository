package com.tka;

import javax.crypto.spec.PSource;

@java.lang.FunctionalInterface
interface MyFunction{
    public abstract int compute(int a , int b);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        //Using noraml Way
        MyFunction function1= new MyFunction() {
            @Override
            public int compute(int a, int b) {
                return a+b;
            }
        };
        int res = function1.compute(10,20);
        System.out.println(res );

        MyFunction function2 = new MyFunction() {
            @Override
            public int compute(int a, int b) {
                return a*b;
            }
        };

        int res2 = function2.compute(10,20);
        System.out.println(res2);

        // using Lambda Expression
        MyFunction function3 = (a,b) -> a+b;
        System.out.println(function3.compute(10,30));

        MyFunction function4 = (a,b)-> a*b;
        System.out.println(function4.compute(10,30));

        MyFunction function5 = (a,b)-> {
            if(a >b) return a*a;else return b*b;
        } ;

        System.out.println(function5.compute(10,20));
        MyFunction myFunction = (a,b)-> Math.min(a,b);
        System.out.println(myFunction.compute(10,20));
    }




}
