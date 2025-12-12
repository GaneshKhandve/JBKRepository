package com.tka.dec10;

public class example {
    public static void main(String[] args) {
        String s = "Instagram";
        String rev ="";
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<s.length();i++){
            System.out.println((8-i)+" -> "+s.charAt(8-i));
        }

//        for (int i =s.length()-1;i>=0;i-- ){
//            rev= rev+s.charAt(i);
//
//        }

                for (int i =s.length()-1;i>=0;i-- ){
                      sb.append(s.charAt(i));

                    }


             String [] db = {"Rahul","Rohit","Suresh","Ramesh","Rajesh","Ritik","Ranjan"};
                int count = 0;


//                for(String name : db){
//                    if(name.endsWith("sh")){
//                        count++;
//                    }
//                }
//
//        System.out.println(count);

//        for(String name : db){
//            if(name.contains("h")){
//                count++;
//            }
//        }

       // System.out.println(count);


        for(String name : db){
            if(name.contains("h") && name.contains("i")){
                count++;
            }
        }

        System.out.println(count);



        System.out.println("Original String ->"+s);
        System.out.println("Reverse String ->"+sb.toString());


    }

}
