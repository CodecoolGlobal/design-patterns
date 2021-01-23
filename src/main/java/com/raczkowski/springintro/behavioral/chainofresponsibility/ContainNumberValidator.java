package com.raczkowski.springintro.behavioral.chainofresponsibility;

public class ContainNumberValidator extends Validator {
    public ContainNumberValidator(Validator next) {
        super(next);
    }

    @Override
    boolean validate(String password) {
        if (password.matches(".*\\d+.*")) {
            if (next != null) {
                next.validate(password);
            }
            return true;
        }
        return false;
    }
}
