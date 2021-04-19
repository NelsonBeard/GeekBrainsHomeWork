package com.company.lesson_8;

public class RunTrack implements AbleToRunAndJump {
    private int distance;

    public RunTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean check(RunnableAndJumpable raj) {
        if (raj.getRunLimit() >= this.distance) {
            System.out.println(raj.getName() + " пробежал " + distance);
            return true;
        } else {
            System.out.println(raj.getName() + " не смог пробежать " + distance + " и сошел с дистанции.");
            return false;
        }
    }
}
