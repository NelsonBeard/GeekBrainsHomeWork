package com.company.Lesson_7;

import java.util.Random;

public class Main {
    private static int catsQuantity = 8;
    private static int maxAppetite = 40;
    public static Random random = new Random();
    public static Plate plate;

    public static void main(String[] args) {
        plate = new Plate (100);
        plate.info();
        Cat[] catsArray = new Cat[catsQuantity];
        for (int i = 0; i < catsQuantity; i++) {
            catsArray[i] = new Cat("cat" + (i + 1), random.nextInt(maxAppetite));
            System.out.print(catsArray[i].toString() + ", ");
        }
        System.out.println();
        for (int i = 0; i < catsQuantity; i++) {
            catsArray[i].eat(plate);
            if (catsArray[i].getSatiety() == false) {
                plate.fillPlate();
                i--;
            }
            plate.info();
            System.out.println();
        }
    }
}
