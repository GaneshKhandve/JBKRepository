package com.tka.controller;
import com.tka.entity.StudentAccess;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAccess s1 = new StudentAccess();
		
		    //System.out.println(s1.rollnumber); not visible in different package because this is default attribute visible only same package.
	       // System.out.println(s1.name);      not visible in same package because this is private attribute.
	        
	        
	        //System.out.println(s1.Addresss);not visible in different package because this is protected attribute visible only when we inherited with this class package
	        System.out.println(s1.collegeName);
	        
	        //s1.displayInformation();
	        s1.displayInformation1(); // visible because its public method 
	        StudentAccess.displayInformation2();//visible because its public static method
	        //s1.displayInformation3();
	        //s1.displayInformation4(); not visible in same package because this is private method.

	}

}
