package com.tka.dec15;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private  String email;
    private transient double salary;
    private String address;

    public Employee() {
        super();
    }

    public Employee(String name, String email, double salary, String address) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
