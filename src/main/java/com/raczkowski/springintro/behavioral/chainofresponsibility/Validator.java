package com.raczkowski.springintro.behavioral.chainofresponsibility;

public abstract class Validator {

    protected final Validator next;

    public Validator(Validator next) {
        this.next = next;
    }

    abstract ValidationResult validate(Form form, ValidationResult validationResult);

}
