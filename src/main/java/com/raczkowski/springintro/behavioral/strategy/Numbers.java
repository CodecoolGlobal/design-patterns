package com.raczkowski.springintro.behavioral.strategy;

public class Numbers {

    private final int x;
    private final int y;

    public Numbers(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculate(MathOperationStrategy mathOperationStrategy) {
        return mathOperationStrategy.execute(x, y);
    }
}
