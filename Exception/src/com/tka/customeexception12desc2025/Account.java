package com.tka.customeexception12desc2025;

public class Account {
    private int balance;
    private int aacNo;
    private String accHolderName;

    public Account(int balance, int aacNo, String accHolderName) {
        this.balance = balance;
        this.aacNo = aacNo;
        this.accHolderName = accHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAacNo() {
        return aacNo;
    }

    public void setAacNo(int aacNo) {
        this.aacNo = aacNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aacNo=" + aacNo +
                ", accHolderName='" + accHolderName + '\'' +
                '}';
    }
}
