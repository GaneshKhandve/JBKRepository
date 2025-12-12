package com.tka.entity;

public class Student extends  College {
    public String studentName;
    int rollNumber;
    protected long mobileNumber;

    public Student(String n, int r, long m) {
        studentName = n;
        rollNumber = r;
        mobileNumber = m;
    }

    public void getStudentDetails() {
        System.out.println(studentName+" -> "+rollNumber+" -> "+mobileNumber+" ");

    }

    public void m1() {
        System.out.println("Method is calling from Child Claas i.e  Student class");
    }
}
