package com.tka.entity;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StudentAccess s1 = new StudentAccess();
        
        System.out.println(s1.rollnumber);
       // System.out.println(s1.name); not visible in same package because this is private attribute.
        
        
        System.out.println(s1.Addresss);
        System.out.println(s1.collegeName);
        
        s1.displayInformation();
        s1.displayInformation1();
        StudentAccess.displayInformation2();
        s1.displayInformation3();
        //s1.displayInformation4(); not visible in same package because this is private method.
	}

}
