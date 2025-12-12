package com.jbk.nov112025;

public class Student {
	String name;
	int roll;
	static String collegeName="NBN Sinhgad School of Engineering"; 
	static String collegeAddress;
	
	//block
	{
		System.out.println("Welcome to Student Class");
	}
	
	//static block
	
	static {
		System.out.println("Static Block Executed");
	}
	Student(){
		System.out.println("Zero Parameter Constructor is Called");
	}
	
	Student(String n,int r){
		name=n;
		roll=r;
	}
	
	void m1() {
		System.out.println("Student Name is "+name+" and Roll number is "+roll);
	}
	
	public int setRoll(int n) {
		roll=n;
		return roll;
	}

}
