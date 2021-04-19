package com.company.lesson_8;

public class Main {

    public static void main(String[] args) {

        RunnableAndJumpable[] competitor = new RunnableAndJumpable[6];
        competitor[0] = new Human("Василий", 200, 2);
        competitor[1] = new Human("Мария", 100, 1);
        competitor[2] = new Cat("Барсик", 300, 3);
        competitor[3] = new Cat("Пушок", 500, 5);
        competitor[4] = new Robot("r2d2", 300, 2);
        competitor[5] = new Robot("Cyrax", 1000, 10);

        AbleToRunAndJump[] obstacle = new AbleToRunAndJump[4];
        obstacle[0] = new RunTrack(50);
        obstacle[1] = new Wall(2);
        obstacle[2] = new RunTrack(500);
        obstacle[3] = new Wall(5);

        for (int i = 0; i < competitor.length; i++) {
            for (AbleToRunAndJump ableToRunAndJump : obstacle) {
                if (ableToRunAndJump.check(competitor[i]) == false) {
                    break;
                }
            }
        }
    }
}

