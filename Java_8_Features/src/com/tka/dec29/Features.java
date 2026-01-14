package com.tka.dec29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Features {
    public static void main(String[] args) {

        List<Integer>  list = Arrays.asList(67,87,54,76,88,91,98);

        List<Integer> graceMarks = list.stream()
                .map(m -> {
                 if(m<85){
                     return m +5;
                 }else {
                     return m;
                 }
                })
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(graceMarks);

        // filter

        List<Integer> topperList = list.stream()
                .filter(m -> m>90)
                .collect(Collectors.toList());
        System.out.println("Topper List"+topperList);

        //reduce

        int sum = list.stream()
                .reduce(0,(n1,n2) -> n1+n2);

        System.out.println(sum);

        int sumofevenNumbers = list.stream()
                .filter(m -> m%2==0)
                .reduce(0,(n1,n2) -> n1+n2);
        System.out.println(sumofevenNumbers);

        list.forEach(m-> System.out.print(m+" "));
        list.forEach(System.out::println);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate dob = LocalDate.of(1997,05,11);
        System.out.println(dob);

        Predicate <Integer> isEven = n -> n%2==0;
        System.out.println(isEven.test(20));
    }
}
