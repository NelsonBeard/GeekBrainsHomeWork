package com.company.Lesson_6;

public class Cat extends Animal{
    static int catCount;

    public Cat(String name) {
        catCount++;
        this.name = name;
        this.runLimit = 200;
        this.swimLimit = 0;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}
