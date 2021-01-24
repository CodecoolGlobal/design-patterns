package com.raczkowski.springintro.behavioral.chainofresponsibility;

import static com.raczkowski.springintro.behavioral.chainofresponsibility.ValidationFailureCause.PHONE_NUMBER_INCORRECT_FORMAT;

public class PhoneNumberValidator extends Validator {

    private final static String PHONE_NUMBER_REGEX = "^\\+[0-9]{11}$";

    public PhoneNumberValidator(Validator next) {
        super(next);
    }

    @Override
    public ValidationResult validate(Form form, ValidationResult validationResult) {
        if (form.getPhoneNumber() != null) {
            if (form.getPhoneNumber().matches(PHONE_NUMBER_REGEX)) {
                if (next != null) {
                    return next.validate(form, validationResult);
                }
            } else {
                validationResult.addFailureCause(PHONE_NUMBER_INCORRECT_FORMAT);
            }
        }

        if (next != null) {
            next.validate(form, validationResult);
        }

        return validationResult;
    }
}

