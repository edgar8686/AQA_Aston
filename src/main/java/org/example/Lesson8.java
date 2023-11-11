package org.example;

import org.example.lesson_8.task_1.Unique;
import org.example.lesson_8.task_2.PhoneBook;

public class Lesson8 {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "orange", "apple", "grape", "banana", "apple", "orange", "grape", "melon", "kiwi", "banana", "apple"};
        Unique unique = new Unique();
        unique.getUniqueWords(wordsArray);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ванов", "123-456");
        phoneBook.add("Петров", "789-012");
        phoneBook.add("Сидоров", "345-678");
        phoneBook.add("Ванов", "111-222");

        System.out.println("Номера телефонов для Ванова: " + phoneBook.get("Ванов"));
        System.out.println("Номера телефонов для Петрова: " + phoneBook.get("Петров"));
        System.out.println("Номера телефонов для Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Номера телефонов для Новикова: " + phoneBook.get("Новиков"));
    }
}