package com.tka.dec16;

public class HDFCBankAccount implements Runnable{
    private  static  int balance = 10000;
    @Override
    public void run() {
        for (int i =1 ; i<=5; i++) {
            this.withdraw(600);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
/// Thread safe application has been made by Synchronized Keyword;
    private synchronized void withdraw(int amount) {
        if (this.balance >= amount){
            System.out.println(Thread.currentThread().getName()+" ---> "+"Amount is going to withdraw from your account ... ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            balance = balance- amount;
            System.out.println("Amount has been withdraw Successfully" + amount);
            System.out.println("Available Balance is "+balance);
        } else {
            System.out.println("Withdraw Transaction Canceled Because Of Insufficient Balance  ");
        }

        for (int i =1; i<=10;i++){
            System.out.println("Ganesh");
        }

    }
}
