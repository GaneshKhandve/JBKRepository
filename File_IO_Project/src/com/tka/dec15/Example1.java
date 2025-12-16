package com.tka.dec15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example1 {
    public static void main(String[] args) {
        //FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        Student student1=null;

        student1 = new Student(5,"Ganesh","ganesh@gmail.com","Ganesh@1105");

        System.out.println(student1);

        String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\FileHandling\\Test.txt";

        try {
            System.out.println("1");
           // fileOutputStream = new FileOutputStream(path);
            System.out.println("2");

            objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            System.out.println(" Writing Object");
            objectOutputStream.writeObject(student1);
            System.out.println("Object written in File Successfully");
        } catch (Exception e){
           e.printStackTrace();
//        } finally {
//            if (fileOutputStream !=null){
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
        }


    }
}
