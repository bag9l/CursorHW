package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // First task
        System.out.println("First task:");
        String str = "Hi, I'm n@nobot3000";
        ForFirstTask forFirstTask = new ForFirstTask(str);
        System.out.println(forFirstTask.toString());

        // Second task
        System.out.println("\nSecond task:");
        String path = "Tolstoi.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        ForSecondTask forSecondTask = new ForSecondTask(scanner);
        System.out.println(forSecondTask.toString());

        scanner.close();
    }
}
