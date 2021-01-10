package com.raczkowski.springintro.behavioral.strategy;

public class Addition implements MathOperationStrategy {

    @Override
    public int execute(int x, int y) {
        return x + y;
    }
}
