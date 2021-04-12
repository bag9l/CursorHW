package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader {
    private Scanner scanner;
    private HashMap<String, Integer> words = new HashMap<>();

    public FileReader(Scanner scanner) {
        this.scanner = scanner;
    }

    private void getWords() {
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

    public String getShortestWord(HashMap<String, Integer> words) {
        String shortestWord = getLongestWord(words);
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

    public String getLongestWord(HashMap<String, Integer> words) {
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
        getWords();
        return "Shortest word in the text: " + getShortestWord(words) +
                " - " + words.get(getShortestWord(words)) + " times\n"
                + "Longest word in the text: " + getLongestWord(words) +
                " - " + words.get(getLongestWord(words)) + " times";
    }
}
