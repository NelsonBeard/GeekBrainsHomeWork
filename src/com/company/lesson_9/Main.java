package com.company.lesson_9;

import java.util.Random;

public class Main {

    public static int arraySize = 4;
    public static Random random = new Random();
    public static int randomLimit = 5;

    public static void main(String[] args) {

        String[][] array = new String[2][arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.toString(random.nextInt(randomLimit) + 1);
                array[1][1] = "a";
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        try {
            arrayElementsSum(array);
        } catch (MyArraySizeException e) {
            System.out.println("Размерность массива отлична от 4х4!");
        } catch (MyArrayDataException e){}

    }

    static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException() {
        }
    }

    public static void arrayElementsSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int arrayElementsSum = 0;
        if (array.length != 4) throw new MyArraySizeException();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayElementsSum = arrayElementsSum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В ячейке " + i + " " + j + " неверное значение.");
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println(arrayElementsSum);
    }
}


