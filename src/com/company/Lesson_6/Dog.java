package com.company.Lesson_6;

public class Dog extends Animal{
    static int dogCount;

    public Dog(String name) {
        dogCount++;
        this.name = name;
        this.runLimit = 500;
        this.swimLimit = 10;

    }
}
