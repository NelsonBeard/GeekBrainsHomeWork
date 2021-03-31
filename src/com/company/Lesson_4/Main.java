package com.company.Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char map[][];
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Ты победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Ты проиграл");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            int winHorizontal = 0;
            int winVertical = 0;
            int winMainDiagonal = 0;
            int winSideDiagonal = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    winHorizontal++;
                }
                if (map[j][i] == symb) {
                   winVertical++;
                }
               if (winHorizontal == DOTS_TO_WIN || winVertical == DOTS_TO_WIN) {
                   return true;
               }
            }
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int i, j;
        do {
            i= rand.nextInt(SIZE);
            j= rand.nextInt(SIZE);
        } while (isCellNotValid (i, j));
        System.out.println("Компьютер сходил в точку " + (i + 1) + " " + (j + 1));
        map[i][j] = DOT_O;
    }
    public static void humanTurn() {
        int i, j;
        do {
            System.out.println("Введи координаты в формате Х У");
            i= sc.nextInt() - 1;
            j= sc.nextInt() - 1;
        } while (isCellNotValid (i, j));
        map[i][j] = DOT_X;
    }
    public static boolean isCellNotValid(int i, int j) {
        if (i < 0 || i >= SIZE || j < 0 || j >= SIZE) return true;
        return !(map[i][j] == DOT_EMPTY);
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
