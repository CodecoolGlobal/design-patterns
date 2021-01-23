package com.raczkowski.springintro.behavioral.chainofresponsibility;

public class LengthValidator extends Validator {
    private static final int MIN = 6;
    private static final int MAX = 25;

    public LengthValidator(Validator next) {
        super(next);
    }

    @Override
    boolean validate(String password) {
        if (MIN <= password.length() && password.length() <= MAX) {
            if (next != null) {
                return next.validate(password);
            }
            return true;
        }
        return false;
    }
}
