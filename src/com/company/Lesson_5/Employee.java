package com.company.Lesson_5;

public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String eMail, int phoneNumber,
                    int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void showEmployeeInformation() {
//        Данный метод специально создан для вывода информации о рабочем, поэтому вывод в консоль осуществил через него,
//        а не передавая String в Main.
        System.out.println("ФИО: " + fullName + "\nДолжность: " + position + "\nEmail: "
         + eMail + "\nНомер телефона: " + phoneNumber + "\nЗарплата: " + salary
                + "\nВозраст: " + age);
        System.out.println();
    }
}
