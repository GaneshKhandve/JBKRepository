package com.tka.entity;

public class Student {
	private int roll ;
    private String name;
    private int marks;

    public Student(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int r) {
        roll = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int m) {
        marks = m;
    }

}
