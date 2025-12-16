package com.tka.dec15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example2 {
    public static void main(String[] args) {
        Student s1 = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\FileHandling\\Test.txt";;

        try {
            System.out.println("1");
          fileInputStream = new FileInputStream(path);
            System.out.println("2");
            objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println("Reading Object");
            s1 = (Student) objectInputStream.readObject();

            System.out.println(s1.getName()+" "+ s1.getRollNumber()+" "+ s1.getGmail() +" " +s1.getPassword() );


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
