package com.company.lesson_8;

public class Robot implements RunnableAndJumpable {
    private String name;
    private int runLimit;
    private int jumpLimit;

    public Robot(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгает");
    }

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }
    public int getJumpLimit() {
        return jumpLimit;
    }
}
