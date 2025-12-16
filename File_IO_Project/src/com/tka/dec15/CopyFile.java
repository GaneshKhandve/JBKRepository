package com.tka.dec15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Admin\\OneDrive\\Desktop\\FileHandling\\Test.txt";
        String destinationFile = "C:\\Users\\Admin\\OneDrive\\Desktop\\FileHandling\\Test2.txt";

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destinationFile)
        ) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
