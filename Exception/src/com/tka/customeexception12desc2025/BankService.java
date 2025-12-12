package com.tka.customeexception12desc2025;

import com.tka.allcustomeexception.InsufficientBalanceException;

public class BankService {
    void withdraw(Account account,int amount) throws InsufficientBalanceException{
        int balance = account.getBalance();

        if(amount > balance){
            throw  new InsufficientBalanceException("Insufficient Balance to Withdraw Please Check Balance First");
        } else{
            account.setBalance(balance - amount);
            System.out.println("Amount has been withdraw Succefulluy remaining balance is  "+ account.getBalance());
        }
    }
}
