package com.company.lesson_12;

public class Main {
    public static final int SIZE = 10_000_000;
    public static final int HALF_SIZE = SIZE / 2;
    public static float[] arr = new float[SIZE];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1f;
        }

        fullArrayCalcTime();
        halfArrayCalcTime();
    }

    public static void fullArrayCalcTime() {
        long calcStartTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время пересчета полного массива: " + (System.currentTimeMillis() - calcStartTime));
    }

    public static void halfArrayCalcTime() {
        float[] half1Arr = new float[HALF_SIZE];
        float[] half2Arr = new float[HALF_SIZE];

        long calcStartTime = System.currentTimeMillis();

        System.arraycopy(arr, 0, half1Arr, 0, HALF_SIZE);
        System.arraycopy(arr, HALF_SIZE, half2Arr, 0, HALF_SIZE);

        Thread half1Calc = new Thread (() -> {
            for (int i = 0; i < half1Arr.length; i++) {
                half1Arr[i] = (float) (half1Arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread half2Calc = new Thread (() -> {
            for (int i = 0; i < half2Arr.length; i++) {
                half2Arr[i] = (float) (half2Arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        half1Calc.start();
        half2Calc.start();

        System.arraycopy(half1Arr, 0, arr, 0, HALF_SIZE);
        System.arraycopy(half2Arr, 0, arr, HALF_SIZE, HALF_SIZE);

        System.out.println("Время пересчета разделенного пополам массива: " + (System.currentTimeMillis() - calcStartTime));
    }

}
