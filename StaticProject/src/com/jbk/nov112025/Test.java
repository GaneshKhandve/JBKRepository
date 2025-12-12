package com.jbk.nov112025;


public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("Ganesh",1);
		Student s2 = new Student();
		
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
		System.out.println(Student.collegeName);
		
		Student.collegeName ="Sinhgad School Of Engineering";
		
		System.out.println(s1.collegeName);
		System.out.println(s2.collegeName);
		System.out.println(Student.collegeName);
		
		System.out.println(Student.collegeAddress);
		
		Student.collegeAddress="Ambegaon,Pune";
		System.out.println(Student.collegeAddress);
		System.out.println(s1.collegeAddress);
		System.out.println(s2.collegeAddress);
		

	}

}
