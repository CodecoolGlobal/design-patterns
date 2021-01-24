package com.raczkowski.springintro.behavioral.chainofresponsibility;

public class PhoneNumberValidator extends Validator {

    private final static String PHONE_NUMBER_REGEX = "^\\+[0-9]{11}$";

    public PhoneNumberValidator(Validator next) {
        super(next);
    }

    @Override
    public boolean validate(Form form) {
        if (form.getPhoneNumber() != null) {
            if (form.getPhoneNumber().matches(PHONE_NUMBER_REGEX)) {
                if (next != null) {
                    return next.validate(form);
                }
                return true;
            }
            return false;
        }

        if (next != null) {
            return next.validate(form);
        } else {
            return true;
        }
    }
}
