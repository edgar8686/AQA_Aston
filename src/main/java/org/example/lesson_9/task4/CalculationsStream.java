package org.example.lesson_9.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CalculationsStream {
    private Collection<Student> students;
    private double averageAge;
    private List<String> armName;
    private List<String> login = new ArrayList<>();

    public CalculationsStream(Collection<Student> students) {
        this.students = students;
    }

    public void getCalculations() {
        averageAge = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .mapToInt(student -> student.getAge())
                .average()
                .orElse(0.0);
        System.out.println("Средний возраст всех студентов музжского пола: " + averageAge);
    }

    public void getArmStudents() {
        armName = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .filter(student -> student.getAge() > 18)
                .filter(student -> student.getAge() < 27)
                .map(student -> student.getName())
                .collect(Collectors.toList());
        System.out.println("Студенты, которым грозят получение повестки:");
        armName.forEach(System.out::println);
    }

    public void getLogin() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите логин: ");
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                login.stream()
                        .filter(s -> s.startsWith("f"))
                        .forEach(System.out::println);
                break;
            } else {
                login.add(str);
            }
        }
    }

}
