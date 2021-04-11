package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ForFirstTask {
    private String str;

    public ForFirstTask(String str) {
        this.str = str;
    }

    public HashMap<Character, Integer> lettersMap(String str) {
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
        return chars;
    }

    public int numOfSigns(String str) {
        String signs = str.replaceAll("[^\\p{Punct}]", "");
        return signs.length();
    }

    public int numOfNumbers(String str) {
        String numbers = str.replaceAll("[^\\d]", "");
        return numbers.length();
    }

    public int numOfSpaces(String str) {
        String spaces = str.replaceAll("[^ ]", "");
        return spaces.length();
    }

    public int numOfLetters(String str) {
        String letters = str.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
        return letters.length();
    }

    private String getLetters(String str) {
        return str.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
    }

    @Override
    public String toString() {
        String string = "";
        for (Map.Entry entry : lettersMap(str).entrySet()) {
            string = string + "Char " + entry.getKey() + " - " + entry.getValue() + "\n";
        }
        string = string + "Number of letter: " + numOfLetters(str)
                + "\nNumber of punctuation marks: " + numOfSigns(str)
                + "\nNumber of numbers: " + numOfNumbers(str)
                + "\nNumber of spaces: " + numOfSpaces(str);
        return string;
    }
}
