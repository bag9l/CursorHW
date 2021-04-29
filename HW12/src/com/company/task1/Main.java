package com.company.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your score: ");
        System.out.println(getRating(in.nextInt()));
        in.close();
    }

    public static String getRating(int num) {
        return switch (num) {
            case 9, 10 -> "Well";
            case 7, 8 -> "Good";
            case 6 -> "Acceptable";
            case 5 -> "Bad";
            case 0, 1, 2, 3, 4 -> "Very Bad";
            default -> "There is no such assessment";
        };
    }
}
