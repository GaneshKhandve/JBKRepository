package com.tka.dec16;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start Main Method");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Job1 job1 = new Job1();
        Job2 job2 = new Job2();
        Job1 job3 = new Job1();
        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);
        Thread t3 = new Thread(job3);
        t1.setName("Thread-One");
        t2.setName("Thread-Two");
        t3.setName("Thraed-Three");
        t1.start();
        t1.join();  // main thread waits for job1 to complete

        t2.start();
        t2.join(); // main thread waits for job2 to complete

        t3.start();
        t3.join();




        for (int i =1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+ " "+"Vaibhav");
            Thread.sleep(500);
        }



        System.out.println("End of Main Method");

    }
}
