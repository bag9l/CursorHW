package com.company.task2;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("A = ");
        int a = setValue(in.next());
        System.out.print("B = ");
        int b = setValue(in.next());

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

    static int setValue(String str) {
        Scanner scanner = new Scanner(System.in);
        int num;
        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Reenter number: ");
            num = setValue(scanner.next());
        }
        return num;
    }
}
