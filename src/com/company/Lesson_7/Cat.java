package com.company.Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String toString() { return name + " " + appetite; }

    public void eat(Plate p) {
        int food = p.getFood();
        if (food > appetite) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println("Кот " + name + " поел.");
        } else { System.out.println("Коту " + name + " не хватает еды. Кот не стал есть."); }
    }
    public boolean getSatiety() { return satiety; }
}
