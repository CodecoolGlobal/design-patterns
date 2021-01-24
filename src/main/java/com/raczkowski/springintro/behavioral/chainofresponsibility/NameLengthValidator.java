package com.raczkowski.springintro.behavioral.chainofresponsibility;

public class NameLengthValidator extends Validator {
    private static final int MIN = 2;
    private static final int MAX = 25;

    public NameLengthValidator(Validator next) {
        super(next);
    }

    @Override
    boolean validate(Form form) {
        String name = form.getName();
        String surname = form.getSurname();

        if (isInRange(name) && isInRange(surname)) {
            return next.validate(form);
        }

        return false;
    }

    private boolean isInRange(String name) {
        return MIN <= name.length() && name.length() <= MAX;
    }
}
