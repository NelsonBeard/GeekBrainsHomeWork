package com.company.Lesson_7;

import java.util.Random;

public class Main {
    private static int catsQuantity = 8;
    private static int maxAppetite = 40;
    public static Random random = new Random();
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Barsik", 10);
//        Cat cat2 = new Cat("Bars", 100);
//        Cat cat3 = new Cat("Bar", 10);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat1.eat(plate);
//        cat2.eat(plate);
//        cat3.eat(plate);
//        plate.info();
        Plate plate = new Plate(100);
        plate.info();
        Cat[] catsArray = new Cat[catsQuantity];
        for (int i = 0; i < catsQuantity; i++) {
            catsArray[i] = new Cat("cat" + (i + 1), random.nextInt(maxAppetite));
            System.out.print(catsArray[i].toString() + ", ");
        }
        System.out.println();
        for (int i = 0; i < catsQuantity; i++) {
            catsArray[i].eat(plate);
            plate.info();
        }
    }
}
