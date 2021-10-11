package ru.geekbrains.lesson5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String telephoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Worker(String name, String position, String email, String telephoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; Электронная почта: "
                + email + "; Номер телефона: " + telephoneNumber + "; Заработная плата: "
                + salary + "; Возраст: " + age);
    }
}
