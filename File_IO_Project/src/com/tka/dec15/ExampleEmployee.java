package com.tka.dec15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExampleEmployee {
    public static void main(String[] args) {
        //FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        Employee e1 = null;
        String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\FileHandling\\Employee.txt";
        e1 = new Employee("Ganesh", "ganesh123@gmail.com", 150000, "Ahilynagar");

        System.out.println(e1);

        try {
            //fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(e1);
            System.out.println("File Write Successfully");

        } catch (Exception e) {
            e.printStackTrace();
//        } finally {
//            if (fileOutputStream!=null){
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        }


    }
}
