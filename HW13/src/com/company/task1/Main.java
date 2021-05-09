package com.company.task1;

public class Main {
    public static void main(String[] args) {
        Thread eggThread = new Thread(new Egg());
        Thread chickenThread = new Thread(new Chicken());

        eggThread.start();
        chickenThread.run();

        if (eggThread.isAlive()) {
            try {
                eggThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\nThe egg won!");
        } else {
            System.out.println("\nThe chicken won!");
        }
    }
}
