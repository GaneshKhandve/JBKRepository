package com.objectcreation;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Student s1 = new Student();
       s1.rollNo=1;
       s1.name = "Ganesh";
       s1.city ="Ahilyanagar";
       s1.printDetaills();
       
       System.out.println(s1.rollNo);
       System.out.println(s1);
       
       Student s2 = new Student();
       s2.rollNo=2;
       s2.name = "Vaibhav";
       s2.city ="Pune";
       s2.printDetaills();
       
       System.out.println(s2.rollNo);
       System.out.println(s2);
       
       Student s3 = new Student();
       s3.rollNo=3;
       s3.name = "Mayur";
       s3.city ="Pune";
       s3.printDetaills();
       
       System.out.println(s3.rollNo);
       System.out.println(s3);
       
       Student s4 = new Student();
       s4.rollNo=4;
       s4.name = "Rushikesh";
       s4.city ="Latur";
       s4.printDetaills();
       
       System.out.println(s4.rollNo);
       System.out.println(s4);
       

	}

}
