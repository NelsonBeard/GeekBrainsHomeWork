package com.company.Lesson_2;

import java.util.Arrays;

public class Main {

    public static void invertArray () {
        int[] array = {1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1};
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1){
                array[i] = 0;
            }else{
                array[i] = 1;
            }
        }
        System.out.println (Arrays.toString(array));
    }
    public static void main(String[] args){
    invertArray();
    }
}
