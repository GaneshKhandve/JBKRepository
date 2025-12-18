package com.tka.dec16;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i =1;i<=9;i++){

            Job3 job3 = new Job3(i);
           // job3.setPriority(i % 10);
            executorService.submit(job3);
        }
        executorService.shutdown();
    }
}
