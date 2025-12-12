package com.tka.customeexception12desc2025;

import com.tka.allcustomeexception.InsufficientBalanceException;

public class Test {
    public static void main(String[] args) {
        int balance = 500;
        int amt = 600;

        if(amt> balance){
            throw  new InsufficientBalanceException("Insufficient Balance ");
        }


    }
}
