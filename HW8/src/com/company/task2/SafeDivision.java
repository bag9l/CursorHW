package com.company.task2;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A = ");
        int a = in.nextInt();
        System.out.print("B = ");
        int b = in.nextInt();
        float result;
        while (true) {
            try {
                if (b == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                result = (float) a / b;
                break;
            } catch (ArithmeticException e) {
                System.out.print("B = 0\nReenter B: ");
                b = in.nextInt();
            }
        }
        System.out.println("A/B = " + result);
    }
}
