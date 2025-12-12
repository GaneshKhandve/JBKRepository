package com.gk.oct17;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentClassConstructor s1 = new StudentClassConstructor("Ganesh",1);
		StudentClassConstructor s2 = new StudentClassConstructor();
		
		System.out.println(s1.name);
		System.out.println(s1.roll);
		
		System.out.println(s2.name);
		System.out.println(s2.roll);
		
		s1.m1();
		s2.m1();
		
		int newRoll =s1.setRoll(21);
		System.out.println(newRoll);
		
		int newRoll2 =s2.setRoll(24);
		System.out.println(newRoll2);
		
		System.out.println(s1.collegeName);
		System.out.println(s2.collegeName);
		System.out.println(StudentClassConstructor.collegeName);
		
		StudentClassConstructor.collegeName ="Sinhgad School Of Engineering";
		
		System.out.println(s1.collegeName);
		System.out.println(s2.collegeName);
		System.out.println(StudentClassConstructor.collegeName);
		
		System.out.println(StudentClassConstructor.collegeAddress);
		
		StudentClassConstructor.collegeAddress="Ambegaon,Pune";
		System.out.println(StudentClassConstructor.collegeAddress);
		System.out.println(s1.collegeAddress);
		System.out.println(s2.collegeAddress);
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
