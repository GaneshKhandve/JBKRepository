package com.tka.dec18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();

        salaryList.add(10000);
        salaryList.add(20000);
        salaryList.add(210000);
       // salaryList.add("Pawan ");
        salaryList.add(210000);

        System.out.println("Salary List "+salaryList);
        System.out.println(salaryList.get(2));

//        for (int i = 0; i<salaryList.size();i++){
//            if(salaryList.get(i) < 25000){
//                salaryList.set(i,salaryList.get(i) + 5000);
//            }
//        }
//        System.out.println("Updated List "+salaryList);

        for(Integer sal : salaryList){
            if (sal> 25000){
                System.out.println(sal);
            }
        }
    }
}
