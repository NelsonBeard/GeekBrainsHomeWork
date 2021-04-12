package com.company.Lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 10);
        Cat cat2 = new Cat("Bars", 100);
        Cat cat3 = new Cat("Bar", 10);
        Plate plate = new Plate(100);
        plate.info();
        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        plate.info();

    }
}
