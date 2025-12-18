package com.tka.dec16;

public class Job1 implements Runnable{
    @Override
    public void run() {

        for (int i =1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" "+"Pratibha");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
