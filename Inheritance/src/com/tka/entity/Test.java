package com.tka.entity;

public class Test {
    public static void main(String[] args) {
        College c1 = new Student("Ganesh",1,7558320121L);// creating a student object with college reference means
        //creating child object with parent reference

        College.College_Name ="NBN Sinhgad Scool Of Engineering";
        //c1.id not visible because its private also the private method is not override

        c1.address="Ambegaon Pune";
        c1.studentCount=150;
        c1.branches="Electronics And telecommunication";
        c1.setId(125);
        c1.getStudentCount();
        c1.m1();
        System.out.println();

        c1.printDetailsOfCollege();

        Student s1 = new Student("Vaibhav",2,7558320121L);
        s1.address="Ambegaon Pune";
        s1.studentCount=151;
        s1.branches="Electronics And telecommunication";
        s1.getStudentDetails();
        s1.printDetailsOfCollege();
        s1.getStudentCount();
        s1.setId(147);
        s1.m1();

    }
}
