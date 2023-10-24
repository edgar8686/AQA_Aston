package org.example.lesson4;

import org.example.lesson4.Employee;

public class Lesson4 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Andreev", "Andrei", "Andreevich", "Engineer", "andr.mail.com", "8932456782", 359000, 33);
        employees[1] = new Employee("Vasiliev", "Ivan", "Ivanovich", "Lawyer", "ivan.mail.com", "89453214562", 301000, 28);
        employees[2] = new Employee("Dudakova", "Anastasia", "Sergeevna", "Lawyer", "ana.gmail.com", "89320000894", 400000, 41);
        employees[3] = new Employee("Pushka", "Vladimir", "Kucovich", "Manager", "pushka.gmail.com", "89567890009", 360000, 35);
        employees[4] = new Employee("Lisin", "Samed", "Kirillovich", "QA Engineer", "samed.gmail.com", "89449090000", 200000, 25);
        // 1 способ с помощью foreach вывести в консоль имя сотрудника старше 40
        for (var employee : employees) {
            if (employee.getAge() > 40) {
                employee.printEmployee();
            }
        }
        // 2 способ с помощью цикла вывести в консоль имя сотрудника старше 40
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printEmployee();
            }
        }
    }
}