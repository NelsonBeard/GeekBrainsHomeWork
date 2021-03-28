package com.company.Lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);


    public static void guessNumber () {
        int randomLimit = 10;
        int tryCount = 3;
        int number = random.nextInt(randomLimit);
        System.out.println("Угадай число от 0 до " + (randomLimit - 1));
        System.out.println("Осталось попыток: " + tryCount);


        for (int i = tryCount; i > 0; i--) {
            int userNumber = scanner.nextInt();
            tryCount--;
            if (userNumber == number) {
                System.out.println("Ты угадал!");
            } else if (tryCount == 0){
                System.out.println("Неправильно. Ты проиграл.");
            }else if (userNumber > number) {
                System.out.println("Меньше");
                System.out.println("Осталось попыток: " + tryCount);
            } else if (userNumber < number) {
                System.out.println("Больше");
                System.out.println("Осталось попыток: " +tryCount);
            }

        }
        System.out.println("Хочешь сыграть еще? (1 - да, 0 - нет)");
        int playAgain = scanner.nextInt();
        if (playAgain == 1) guessNumber();
    }

//    public static void guessWord () {
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
//                "brocoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
//                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
//                "pepper", "pineapple", "pumpkin", "potato"};
//        System.out.println(Arrays.toString(words));
//        System.out.println("Угадай загаданное слово из приведенных выше ");
//        int wordIndex = random.nextInt(words.length);
//        String userWord = scanner.next();
//        if (userWord.equals(words[wordIndex]))
//            System.out.println("Ты угадал!");
//        else
//            System.out.println("xyz");
//
//    }
//


    public static void main(String[] args){
//        guessNumber();
//        guessWord();
        scanner.close();
    }
}
