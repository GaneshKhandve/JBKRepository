package com.tka.dec16;

public class Job3 extends Thread{
    int j_Id;

    Job3(int id){
        this.j_Id = id;
    }

    @Override
    public void run() {
        System.out.println(this.j_Id + " ----> "+Thread.currentThread().getName() +" Started");
//        System.out.println("Job 3 with ID : "+j_Id+" is Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(this.j_Id + " ----> "+Thread.currentThread().getName() +" Finished");
    }
}
