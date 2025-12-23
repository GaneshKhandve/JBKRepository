package com.tka.dec19;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        List l1 = new ArrayList();
        l1.add(25000);

        Set hs = new HashSet();

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(12);
        numbers.add(14);
        numbers.add(10);
        numbers.add(4);

        System.out.println(numbers);

        for (Integer num : numbers){
            System.out.print( num+ " ");
        }

        System.out.println();
        hs.add("Sai");
        hs.add(true);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(10.2);

        System.out.println(hs);

        for (Object o : hs){
            System.out.print(o+ " ");

//            if (o instanceof Integer){
//             List l2 = (List) o;
//                System.out.println(l1.get(0));
//            }
        }



    }
}
