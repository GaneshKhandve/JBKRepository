package com.tka.entity;

public class College {
    public static String College_Name;
    private static int id ;
    public String address ;
    protected  int studentCount;
    String branches;

    public void  printDetailsOfCollege() {
        System.out.println(College_Name+"-> "+id+" -> " +address+" ->"+studentCount+" -> "+branches);
    }

    private void getCollegeName() {
        System.out.println(College_Name);
    }

    protected int getStudentCount() {
        return studentCount;
    }

    public void setId(int i) {
        id=i;
    }

    public void m1() {
        System.out.println("Method is calling from Parent Claas i.e  College class");
    }

}
