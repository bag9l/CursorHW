package com.company.task2;

import java.util.concurrent.Semaphore;

public class Main {
    public static final Semaphore TABLE = new Semaphore(2, true);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Philosopher(i, TABLE)).start();
            Thread.sleep(100);
        }
    }
}
