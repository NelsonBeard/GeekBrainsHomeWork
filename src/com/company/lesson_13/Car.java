package com.company.lesson_13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    public static CountDownLatch START = Main.START;
    public static CountDownLatch FINISH = Main.FINISH;
    public static CyclicBarrier PREPARE_TO_START = Main.PREPARE_TO_START;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник №" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            START.countDown();
            System.out.println(this.name + " готов");
            PREPARE_TO_START.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        FINISH.countDown();
        if (FINISH.getCount() == Main.CARS_COUNT - 1) {
            System.out.println(this.name + " выиграл гонку!");
        }
    }
}
