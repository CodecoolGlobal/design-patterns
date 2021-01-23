package com.raczkowski.springintro.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Validator validator = new LengthValidator(new ContainNumberValidator(null));

        String password = "nn";
        boolean result = validator.validate(password);

        System.out.println("Password: " + password + " validation has " + (result ? "passed" : "failed"));
    }
}
