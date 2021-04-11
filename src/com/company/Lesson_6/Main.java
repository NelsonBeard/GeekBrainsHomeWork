package com.company.Lesson_6;

import static com.company.Lesson_6.Animal.animalCount;
import static com.company.Lesson_6.Cat.catCount;
import static com.company.Lesson_6.Dog.dogCount;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Гром");
        Animal dog2 = new Dog("Зевс");
        Animal cat1 = new Cat("Пушистик");
        dog1.run(600);
        dog2.run(400);
        cat1.run(201);
        dog1.swim(10);
        cat1.swim(1);

        System.out.println("Создано животных: " + animalCount);
        System.out.println("Создано собак: " + dogCount);
        System.out.println("Создано котов: " + catCount);

    }

}
