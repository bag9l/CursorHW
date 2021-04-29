package com.company.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String str = in.next();
        String[] numbers = str.split(",");
        List<Integer> numberList = new ArrayList<>();

        for (String number : numbers) {
            numberList.add(Integer.valueOf(number));
        }

        double uniqueness = numberList.stream().collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.toSet(),
                (count, uniqueQuantity) -> (double) uniqueQuantity.size() / count));

        System.out.println('[' + str + ']' + " -> " + uniqueness * 100 + '%');
        in.close();
    }
}
