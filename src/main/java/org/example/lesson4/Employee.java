package org.example.lesson4;

public class Employee {
    private String family;
    private String firstName;
    private String patronymic;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String family, String firstName, String patronymic, String post, String email, String phoneNumber, int salary, int age) {
        this.family = family;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println("Family: " + family + "," + " Name: " + firstName + "," + " Patronymic: " + patronymic + "," + " Post: " + post + "," + " Email: " + email + "," + " Phone number: " + phoneNumber + "," + " Salary: " + salary + "," + " Age: " + age + ".");
    }

    public int getAge() {
        return age;
    }
}
