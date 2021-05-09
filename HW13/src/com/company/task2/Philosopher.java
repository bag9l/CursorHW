package com.company.task2;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {
    private int num;
    private Semaphore table;

    public Philosopher(int num, Semaphore table) {
        this.num = num;
        this.table = table;
    }

    @Override
    public void run() {
        try {
            table.acquire();
            System.out.println("The philosopher №" + num + " sat down at the table");
            Thread.sleep(3000);
            System.out.println("The philosopher №" + num + " got up from the table");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
