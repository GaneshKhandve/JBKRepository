package com.tka.entity;

public class Mobile extends Sim implements Amazon,FlipCart {
     long mobileSimNum =7558320121l;

    @Override
    public void simActivate() {
        System.out.println(mobileSimNum+" Airtel Sim is activated");
    }
    @Override
    public void loginFlipCart() {
        System.out.println("Welcome to FlipCartApp");
    }

    @Override
    public void loginAmazon() {
        System.out.println("Welcome to Amazon App");
    }

    @Override
    public void addProduct() {
        System.out.println("Product is added In Amazon cart");
    }


}
