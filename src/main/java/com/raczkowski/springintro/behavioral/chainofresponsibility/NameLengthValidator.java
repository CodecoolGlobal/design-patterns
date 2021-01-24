package com.raczkowski.springintro.behavioral.chainofresponsibility;

import static com.raczkowski.springintro.behavioral.chainofresponsibility.ValidationFailureCause.NAME_INCORRECT_LENGTH;

public class NameLengthValidator extends Validator {
    private static final int MIN = 2;
    private static final int MAX = 25;

    public NameLengthValidator(Validator next) {
        super(next);
    }

    @Override
    public ValidationResult validate(Form form, ValidationResult validationResult) {
        if (isInRange(form.getName()) && isInRange(form.getSurname())) {
            return next.validate(form, validationResult);
        }

        validationResult.addFailureCause(NAME_INCORRECT_LENGTH);

        return next.validate(form, validationResult);
    }

    private boolean isInRange(String name) {
        return MIN <= name.length() && name.length() <= MAX;
    }
}
