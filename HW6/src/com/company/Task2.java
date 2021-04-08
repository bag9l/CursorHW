package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "Tolstoi.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        HashMap<String, Integer> words = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^а-яёА-ЯЁ]", "");
            if (words.containsKey(word)) {
                int valueInt = words.get(word) + 1;
                words.put(word, valueInt);
            } else {
                words.put(word, 1);
            }
        }
        System.out.println("Shortest word in the text: " + shortestWord(words) +
                " - " + words.get(shortestWord(words)) + " times\n");
        System.out.println("Longest word in the text: " + longestWord(words) +
                " - " + words.get(longestWord(words)) + " times");
        scanner.close();
    }

    public static String shortestWord(HashMap<String, Integer> words) {
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

    public static String longestWord(HashMap<String, Integer> words) {
        String longestWord = "";
        for (Map.Entry entry : words.entrySet()) {
            String entryKey = entry.getKey().toString();
            if (longestWord.length() <= entryKey.length()) {
                if (longestWord.length() == entryKey.length()) {
                    if (longestWord.compareTo(entryKey) <= 0) {
                        longestWord = entryKey;
                    }
                } else {
                    longestWord = entryKey.toString();
                }
            }
        }
        return longestWord;
    }
}
