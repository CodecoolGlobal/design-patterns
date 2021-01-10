package com.raczkowski.springintro.behavioral.strategy;

public class Subtraction implements MathOperationStrategy {
    @Override
    public int execute(int x, int y) {
        return x - y;
    }
}
