package com.tka.allcustomeexception;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(){
        super();
    }

    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
