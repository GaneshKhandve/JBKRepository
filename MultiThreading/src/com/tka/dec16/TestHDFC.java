package com.tka.dec16;

public class TestHDFC {
    public static void main(String[] args) {
        HDFCBankAccount hdfcBankAccount = new HDFCBankAccount();
        Thread thread1 = new Thread(hdfcBankAccount);
        Thread thread2 = new Thread(hdfcBankAccount);

        thread1.setName("Amazon");
        thread2.setName("FlipCart");

        thread1.start();
        thread2.start();


    }
}
