package com.tka.entity;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student(1,"Ganesh Khandve",100);
     System.out.println(s1.getRoll()+" -> "+s1.getName()+"-> "+s1.getMarks());
     s1.setRoll(2);
     s1.setName("Vaibhav Karche");    
     s1.setMarks(98);
     System.out.println(s1.getRoll()+" -> "+s1.getName()+"-> "+s1.getMarks());
     
     System.out.println();
     
     Player p1 = new Player(1,"Ganesh Khandve",100,5,"India");
     System.out.println(p1.getJersey_No()+" -> "+p1.getPlayerName()+" -> "+p1.getRuns()+" -> "+p1.getWicket()+" -> "+p1.getTeamName());
     
     p1.setJersey_No(2);
     p1.setPlayerName("Vaibhav Karche");
     p1.setRuns(101);
     p1.setWickete(4);
     p1.setTeamName("India");
     System.out.println(p1.getJersey_No()+" -> "+p1.getPlayerName()+" -> "+p1.getRuns()+" -> "+p1.getWicket()+" -> "+p1.getTeamName());
    
     System.out.println();
     
    Product p2= new Product(1,"IPhone 17 Pro Max",140000,"SmartPhone",3);
    
    System.out.println(p2.getId()+" -> "+p2.getName()+" -> "+p2.getPrice()+" -> "+p2.getCategory()+" -> "+p2.getQuantity());
    p2.setId(2);
    p2.setName("SamSung Galaxy Fold 7");
    p2.setPrice(150000);
    p2.setCategory("SmartPhones");
    p2.setQuantity(5);
    
    System.out.println(p2.getId()+" -> "+p2.getName()+" -> "+p2.getPrice()+" -> "+p2.getCategory()+" -> "+p2.getQuantity());
     
     
     
     
	}

}
