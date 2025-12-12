package com.gk.oct17;

public class StudentClassConstructor {
	String name;
	int roll;
	static String collegeName="NBN Sinhgad School of Engineering"; 
	static String collegeAddress;
	
	
	StudentClassConstructor(){
		System.out.println("Zero Parameter Constructor is Called");
	}
	
	StudentClassConstructor(String n,int r){
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
