package com.tka.dec22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {

        List<String> castDhurandhar = new ArrayList<>();
        castDhurandhar.add("Ranveer Singh");
        castDhurandhar.add("Akshay Khanna");
        castDhurandhar.add("Sanjay Dutt");
        castDhurandhar.add("Sara Arjun");
        castDhurandhar.add("Arjun Rampal");


        List<String> castChava = new ArrayList<>();
        castChava.add("Vicky Kaushal");
        castChava.add("Akshay Khanna");
        castChava.add("Rshmika  Mandana");

        List<String> castDashaawtar = new ArrayList<>();
        castDashaawtar.add("Dilip Prbhvalkar");
        castDashaawtar.add("Mahesh Manjrekar");
        castDashaawtar.add("Sidhharth Menon");
        castDashaawtar.add("Priyadarshni Jadhav");

        Map<String,List<String>> movies2025DB = new HashMap<>();
        movies2025DB.put("Dhurandhar",castDhurandhar);
        movies2025DB.put("Dashawatar",castDashaawtar);
        movies2025DB.put("Chava",castChava);

       // System.out.println(movies2025DB);

//        for(Map.Entry<String,List<String>> entry : movies2025DB.entrySet()){
//            System.out.println("Movie Name : " + entry.getKey()+"  "+ "Cast : " + entry.getValue());
//        }

        for(Map.Entry<String,List<String>> entry : movies2025DB.entrySet()){
            for (String actor : entry.getValue()) {
                if (actor.toLowerCase().contains("ranveer")) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }
        }




    }
}
