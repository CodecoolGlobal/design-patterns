package com.raczkowski.springintro.behavioral.chainofresponsibility;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Validator validator = new NameLengthValidator(new PhoneNumberValidator(null));

        Form form = new Form("Przemek", "Raczkowski", new Date(), "+48577296321");

        ValidationResult validationResult = validator.validate(form, new ValidationResult());

        System.out.println(validationResult.successful() ? "PASSED" : validationResult);
    }
}
