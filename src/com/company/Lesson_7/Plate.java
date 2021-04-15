package com.company.Lesson_7;

public class Plate {
    private int food;
    private int fullPlateFood;

    public Plate(int food) {
        this.food = food;
        this.fullPlateFood = food;
    }

    public int getFood() {
        return food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() { System.out.println("В тарелке " + food + " еды."); }
    public void fillPlate() {
        this.food = fullPlateFood;
        System.out.println("Тарелка автонаполнилась.");
    }

}
