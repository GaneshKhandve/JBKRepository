package com.tka.allcustomeexception;

public class AgeToHighException extends  RuntimeException{
    public AgeToHighException(){
        super();
    }
    public AgeToHighException(String msg){
        super(msg);
    }
}
