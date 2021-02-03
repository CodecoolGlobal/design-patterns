package com.raczkowski.springintro.structural.composite;

public class Manager implements Employee {

    private String name;
    private int wage;

    @Override
    public void increaseWage(int wage) {
        this.wage += wage;
    }
}
