package com.tka.entity;

public class StudentAccess {
	int rollnumber = 1;
	private String name ="Ganesh Khandve";
	protected String Addresss ="Hadpasar, Pune";
	public String collegeName ="NBN Sinhgad School Of Engineering";
	
	void displayInformation() {
		
		System.out.println(rollnumber);
		System.out.println(name);
		System.out.println(Addresss);
		System.out.println(collegeName);
	}
	
    public void displayInformation1() {
		
		System.out.println(rollnumber);
		System.out.println(name);
		System.out.println(Addresss);
		System.out.println(collegeName);
	}
    
public static void displayInformation2() {
		StudentAccess s1 = new StudentAccess();
		System.out.println(s1.rollnumber);
		System.out.println(s1.name);
		System.out.println(s1.Addresss);
		System.out.println(s1.collegeName);
	}
  
protected void displayInformation3() {
	
	System.out.println(rollnumber);
	System.out.println(name);
	System.out.println(Addresss);
	System.out.println(collegeName);
}

private void displayInformation4() {
	
	System.out.println(rollnumber);
	System.out.println(name);
	System.out.println(Addresss);
	System.out.println(collegeName);
}


}
