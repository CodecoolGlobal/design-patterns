package com.raczkowski.springintro.creational.singleton;

public class SomeSpecificConfiguration {

    private static SomeSpecificConfiguration INSTANCE;

    private SomeSpecificConfiguration() {
    }

    public static SomeSpecificConfiguration getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SomeSpecificConfiguration();
        }

        return INSTANCE;
    }

}
