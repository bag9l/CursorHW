package com.company;

import java.util.HashMap;
import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {
        String str = "Hi, I'm n@nobot3000";

        System.out.println("Number of letter: " + numOfLetters(str));
        System.out.println("Number of punctuation marks: " + numOfSigns(str));
        System.out.println("Number of numbers: " + numOfNumbers(str));
        System.out.println("Number of spaces: " + numOfSpaces(str));

        HashMap<Character, Integer> chars = new HashMap<>();
        String allLetters = getLetters(str).toLowerCase(Locale.ROOT);
        int counter;
        for (int i = 0; i < allLetters.length(); i++) {
            counter = 0;
            for (int j = 0; j < allLetters.length(); j++) {
                if (allLetters.charAt(i) == allLetters.charAt(j)) {
                    counter++;
                }
                chars.put(allLetters.charAt(i), counter);
            }
        }

        chars.forEach((key, value) -> System.out.println("Char " + key + " - "
                + value));

    }

    public static int numOfSigns(String str) {
        String signs = str.replaceAll("[^\\p{Punct}]", "");
        return signs.length();
    }

    public static int numOfNumbers(String str) {
        String numbers = str.replaceAll("[^\\d]", "");
        return numbers.length();
    }

    public static int numOfSpaces(String str) {
        String spaces = str.replaceAll("[^ ]", "");
        return spaces.length();
    }

    public static int numOfLetters(String str) {
        String letters = str.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
        return letters.length();
    }

    public static String getLetters(String str) {
        return str.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
    }
}
