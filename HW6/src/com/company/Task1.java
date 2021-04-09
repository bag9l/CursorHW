package com.company;

import java.util.HashMap;
import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {
        String str = "Hi, I'm n@nobot3000";

        String removeSigns = str.replaceAll("\\p{Punct}", "");
        int numOfSigns = str.length() - removeSigns.length();

        String removeNumbers = removeSigns.replaceAll("[0-9]", "");
        int numOfNumbers = removeSigns.length() - removeNumbers.length();

        String removeSpaces = removeNumbers.replaceAll(" ", "");
        int numOfSpaces = removeNumbers.length() - removeSpaces.length();

        int numOfLetters = removeSpaces.length();

        HashMap<Character, Integer> chars = new HashMap<>();
        String allLetters = removeSpaces.toLowerCase(Locale.ROOT);
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

        System.out.println("Number of letter: " + numOfLetters);
        System.out.println("Number of numbers: " + numOfNumbers);
        System.out.println("Number of punctuation marks: " + numOfSigns);
        System.out.println("Number of spaces: " + numOfSpaces);
    }
}
