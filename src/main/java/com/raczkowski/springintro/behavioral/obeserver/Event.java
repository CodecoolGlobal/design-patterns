package com.raczkowski.springintro.behavioral.obeserver;

public class Event {
    private String message;

    public Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Event{" +
                "message='" + message + '\'' +
                '}';
    }
}
