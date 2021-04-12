package com.company.Lesson_7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
        if (food < 0) {
            System.out.println("Еда кончилась. Кот не наелся. Не хватило " + -food + " еды.");
            food = 0;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
