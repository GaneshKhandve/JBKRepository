package com.tka.customeexception12desc2025;

import com.tka.allcustomeexception.InsufficientBalanceException;

public class SBIBank extends BankService {
    public static void main(String[] args) {
        Account account = new Account(1000,101563580,"Ganesh Khandve");
        BankService service = new SBIBank();
        try {
            service.withdraw(account,500);
        } catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }



    }
}
