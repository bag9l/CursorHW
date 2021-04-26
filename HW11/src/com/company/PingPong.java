package com.company;

public class PingPong {
    private boolean flag;

    public synchronized void ping() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ping");
        flag = true;
        notify();
    }

    public synchronized void pong() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Pong");
        flag = false;
        notify();
    }
}
