package com.tka.dec22;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {

    public static void main (String[] args) {
        Map map = new HashMap();
        map.put(10, "Ganesh");
        map.put(4, false);
        map.put(7, "Ganesh");

        System.out.println(map);

        Map<Integer, String> studentDB1 = new HashMap<>();
        studentDB1.put(10, "Rahul");
        studentDB1.put(2, "Ganesh");
        studentDB1.put(11, "Vaibhav");
        studentDB1.put(12, "Ramesh");
        studentDB1.put(12, "Suresh");
        System.out.println(studentDB1);
        System.out.println(studentDB1.size());

        System.out.println(studentDB1.get(11));
        // all keys
        System.out.println(studentDB1.keySet());

        for (Integer k : studentDB1.keySet()) {
            System.out.println("Key " + k + "  Value " + studentDB1.get(k));
        }

        //all values

        System.out.println(studentDB1.values());

        for (String v : studentDB1.values()) {
            if (v.contains("G")) {
                System.out.println("Values " + v);
            }

        }

        // entry set

        for (Map.Entry<Integer,String> entry : studentDB1.entrySet()){
            System.out.println("key " +entry.getKey()+" Value " +entry.getValue());
        }
    }
}
