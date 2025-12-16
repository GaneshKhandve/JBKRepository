package com.tka.dec15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeFileReading {
    public static void main(String[] args) {
       Employee e1 = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream= null;

                String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\FileHandling\\Employee.txt";

                try {
                    fileInputStream = new FileInputStream(path);
                    objectInputStream = new ObjectInputStream(fileInputStream);
                    System.out.println("Reading Object");
                   e1 = (Employee) objectInputStream.readObject();
                    System.out.println(e1.getName()+ " "+e1.getAddress()+" "+ e1.getEmail()+ " " +e1.getSalary() );
                } catch (Exception e){
                    e.printStackTrace();
                }

    }
}
