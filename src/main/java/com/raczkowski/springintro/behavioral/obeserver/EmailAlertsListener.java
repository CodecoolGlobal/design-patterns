package com.raczkowski.springintro.behavioral.obeserver;

public class EmailAlertsListener implements EventListener {
    @Override
    public void update(Event event) {
        System.out.println("Sending email with message: " + event.getMessage());
    }
}
