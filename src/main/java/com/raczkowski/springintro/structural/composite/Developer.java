package com.raczkowski.springintro.structural.composite;

public class Developer implements Employee {

    private String name;
    private int wage;

    public Developer(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    @Override
    public void increaseWage(int wage) {
        this.wage += wage;
    }
}
