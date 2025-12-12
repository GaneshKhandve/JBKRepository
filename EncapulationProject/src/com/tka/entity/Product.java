package com.tka.entity;
// i had taken 6 min to compete this POJO Class.
public class Product {
	private int p_Id;
	private String product_Name;
	private int price;
	private  String category;
	private int quantity;
	
	public Product(int id,String name,int p,String c,int q ) {
		p_Id=id;
		product_Name=name;
		price=p;
		category=c;
		quantity=q;
	}
	
	public int getId() {
		return p_Id;
	}
	
	public void setId(int id) {
		p_Id=id;
	}
	
    public String getName() {
    	return product_Name;
    }
    
    public void setName(String name) {
    	product_Name=name;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public void setPrice(int p) {
    	price=p;
    }
    
    public String getCategory() {
    	return category;
    }
    
    public void setCategory(String c) {
    	category=c;
    }
    
    
    public int getQuantity() {
    	return quantity;
    }
    
    public void setQuantity(int q) {
    	quantity=q;
    }
    
    
}
