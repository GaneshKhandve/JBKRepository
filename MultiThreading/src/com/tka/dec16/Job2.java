package com.tka.dec16;

public class Job2 implements  Runnable{
    @Override
    public void run() {
        System.out.println();
        for (int i =1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" " +"Ganesh");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
