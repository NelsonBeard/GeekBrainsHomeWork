package com.company.Lesson_1;

public class Main {

    public static float toCalc(float a, float b, float c, float d){
       return a * (b + c / d);
    }

    public static boolean checkSum(int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20){
            return true;
        }else{
            return false;
        }
    }

    public static void checkNumber(int a){
        if (a >= 0) System.out.println("Число положительно.");
        else System.out.println("Число отрицательно.");
    }

    public static boolean checkNumberBoolean(int a){
        if (a >= 0) return false;
        else return true;
    }

    public static void sayHello(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void checkYear(int year){
       if (year % 400 == 0){
           System.out.println("Год високосный.");
       }else if (year % 100 == 0) {
           System.out.println("Год не високосный.");
       }else if (year % 4 == 0){
           System.out.println("Год високосный.");
       }else{
           System.out.println("Год не високосный.");
       }
    }

    public static void main(String[] args) {
    byte b = -100;
    int i = 2500;
    long l = 4000L;
    float f = 8.27f;
    double d = 202.211;
    char c = 'B';
    boolean bo = true;
    String s = "Доброго времени суток, преподаватель! Я рад, что начал изучать программирование.";
//
//    System.out.println(s);
//    System.out.println(toCalc(2.1f, 4.4f, 12.4f, 2.0f));
//    System.out.println(checkSum(7, 19));
//    checkNumber(800);
//    System.out.println(checkNumberBoolean(0));
      sayHello("Ильнур");
//    checkYear(2000);

    }
}
