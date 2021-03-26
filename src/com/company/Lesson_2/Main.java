package com.company.Lesson_2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void invertArray() {
        int[] array = { 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println (Arrays.toString(array));
    }

    public static void fillArray() {
        int[] array = new int[8];
        int incVal = 3;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] + incVal;
        }
        System.out.println (Arrays.toString(array));
    }
    public static void multiplyArray() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int multiplyCoefficient = 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * multiplyCoefficient;
            }
        }
        System.out.println (Arrays.toString(array));
    }
    public static void fillArrayDiagonal() {
        int arraySize = 15;
        int[][] sqareArray = new int[arraySize][arraySize];
        int diagonalMarker = 1;
        for (int i = 0; i < sqareArray.length; i++) {
            for (int j = 0; j < sqareArray.length; j++) {
                if ((i == j) || (i + j == sqareArray.length - 1)) {
                    sqareArray[i][j] = diagonalMarker;
                }
                System.out.print (sqareArray[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void findMinAndMaxArrayValue() {
        Random random = new Random();
        int arraySize = 15;
        int randomLimit = 100;
        int[] array = new int[arraySize];

        for (int i = 0 ; i < array.length ; i++) {
            array[i] = random.nextInt(randomLimit);
        }

        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        System.out.println (Arrays.toString(array));
        System.out.println("Минимальное значение массива: " + minValue);
        System.out.println("Максимально значение массива: " + maxValue);
    }



    public static void main(String[] args){
//    invertArray();
//    fillArray();
//    multiplyArray();
//    fillArrayDiagonal();
        findMinAndMaxArrayValue();
    }
}
