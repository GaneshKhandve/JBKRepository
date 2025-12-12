package com.tka.allcustomeexception;

public class AgeToLowException extends RuntimeException{
    public AgeToLowException(){
        super();
    }
    public AgeToLowException(String msg){
        super(msg);
    }
}
