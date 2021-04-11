package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForSecondTask {
    private Scanner scanner;
    private HashMap<String, Integer> words = new HashMap<>();

    public ForSecondTask(Scanner scanner) {
        this.scanner = scanner;
    }

    private void words() {
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^а-яёА-ЯЁ]", "");
            if (words.containsKey(word)) {
                int valueInt = words.get(word) + 1;
                words.put(word, valueInt);
            } else {
                words.put(word, 1);
            }
        }
    }

    public String shortestWord(HashMap<String, Integer> words) {
        String shortestWord = longestWord(words);
        for (Map.Entry entry : words.entrySet()) {
            String entryKey = entry.getKey().toString();
            if (shortestWord.length() >= entryKey.length() && entryKey.length() >= 1) {
                if (shortestWord.length() == entryKey.length()) {
                    if (shortestWord.compareTo(entryKey) >= 0) {
                        shortestWord = entryKey;
                    }
                } else {
                    shortestWord = entryKey;
                }
            }
        }
        return shortestWord;
    }

    public String longestWord(HashMap<String, Integer> words) {
        String longestWord = "";
        for (Map.Entry entry : words.entrySet()) {
            String entryKey = entry.getKey().toString();
            if (longestWord.length() <= entryKey.length()) {
                if (longestWord.length() == entryKey.length()) {
                    if (longestWord.compareTo(entryKey) <= 0) {
                        longestWord = entryKey;
                    }
                } else {
                    longestWord = entryKey;
                }
            }
        }
        return longestWord;
    }

    @Override
    public String toString() {
        words();
        return "Shortest word in the text: " + shortestWord(words) +
                " - " + words.get(shortestWord(words)) + " times\n"
                + "Longest word in the text: " + longestWord(words) +
                " - " + words.get(longestWord(words)) + " times";
    }
}
