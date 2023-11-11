package org.example.lesson_8.task_1;

import java.util.*;

public class Unique {
    private Set<String> uniqueWords;
    private Map<String, Integer> wordFrequency;

    public void getUniqueWords(String[] wordsArray) {
        uniqueWords = new HashSet<>(Arrays.asList(wordsArray));
        wordFrequency = new HashMap<>();
        for (String word : wordsArray) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            if (wordFrequency.get(word) == 1) {
                uniqueWords.add(word);
            } else {
                uniqueWords.remove(word);
            }
        }
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Частота встречаемости каждого слова:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
        }
    }
}
