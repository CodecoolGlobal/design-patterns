package com.raczkowski.springintro.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Numbers numbers = new Numbers(5, 10);

        int multiplication = numbers.calculate(new Multiplication());
        int subtraction = numbers.calculate(new Subtraction());
        int addition = numbers.calculate(new Addition());

        System.out.println(multiplication);
        System.out.println(subtraction);
        System.out.println(addition);
    }
}
