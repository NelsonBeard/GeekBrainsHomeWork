package com.company.lesson_8;

public class Wall implements AbleToRunAndJump {
    private int height;

    public Wall (int height) {
        this.height = height;
    }

    @Override
    public boolean check(RunnableAndJumpable raj) {
        if (raj.getJumpLimit() >= this.height) {
            System.out.println(raj.getName() + " перепрыгнул " + height);
            return true;
        } else {
            System.out.println(raj.getName() + " не смог перепрыгнуть " + height + " и сошел с дистанции.");
            return false;
        }
    }
}
