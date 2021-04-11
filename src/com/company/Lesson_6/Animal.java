package com.company.Lesson_6;

public class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    static int animalCount;


    public Animal() {
        animalCount++;
    }


    public void run (int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        }else{
            System.out.println(name + " не может пробежать больше " + runLimit + " м.");
        }
    }

    public void swim (int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        }else{
            System.out.println(name + " не может проплыть больше " + swimLimit + " м.");
        }
    }

}



