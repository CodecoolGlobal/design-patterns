package com.raczkowski.springintro.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidationResult {

    private final List<ValidationFailureCause> failures;

    public ValidationResult() {
        this.failures = new ArrayList<>();
    }

    public void addFailureCause(ValidationFailureCause result) {
        failures.add(result);
    }

    public boolean successful() {
        return failures.isEmpty();
    }

    @Override
    public String toString() {
        return failures.stream()
                .map(Enum::toString)
                .collect(Collectors.joining(",", "[", "]"));
    }
}
