package org.example;

import org.example.lesson_9.task1.AnyNumber;
import org.example.lesson_9.task2.ListString;
import org.example.lesson_9.task3.ListElement;
import org.example.lesson_9.task4.CalculationsStream;
import org.example.lesson_9.task4.Gender;
import org.example.lesson_9.task4.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Lesson9 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, -4, 8, 888, 123, -12, 448, 5795, 68, 3, 10};
        AnyNumber anyNumber = new AnyNumber(arr);
        anyNumber.getCountEvenNumber();
        List<String> list = new ArrayList<>(Arrays.asList("Highload", "High", "Load", "Highload"));
        List<String> list2 = new ArrayList<>(Arrays.asList("f10", "f15", "f2", "f4", "f4"));
        Collection<Student> students = Arrays.asList(
                new Student("митрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        ListString listString = new ListString(list);
        ListElement listElement = new ListElement(list2);
        CalculationsStream calculationsStream = new CalculationsStream(students);

        listString.getCountStr();
        listString.getFirstElement();
        listString.getLastElement();
        listElement.getArrSorted();

        calculationsStream.getCalculations();
        calculationsStream.getArmStudents();
        calculationsStream.getLogin();
    }

}