package com.tka.dec15;

import java.io.Serializable;

public class Student implements Serializable {
private int rollNumber;
private String name;
private String gmail;
private transient String password;

    public Student() {
        super();
    }

    public Student(int rollNumber, String name, String gmail, String password) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gmail = gmail;
        this.password = password;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
