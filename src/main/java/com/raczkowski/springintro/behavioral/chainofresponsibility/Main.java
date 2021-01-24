package com.raczkowski.springintro.behavioral.chainofresponsibility;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Validator validator = new NameLengthValidator(new PhoneNumberValidator(null));

        Form form = new Form("Przemek", "Raczkowski", new Date(), "+48577266321");
        boolean result = validator.validate(form);

        System.out.println(result);
    }
}
