package com.tka.entity;

public class Sim {
    String simName ="Airtel";
    String state ="Maharashtra";
    String countryCode = "+91";
    String country ="India";

    public void simActivate(){
        System.out.println("Sim is Activited");
    }

    public void simInfo(){
        System.out.println("Sim Information is "+simName+" ,  "+state+" , "+countryCode+" , "+country);
    }


}
