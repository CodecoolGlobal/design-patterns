package com.raczkowski.springintro.behavioral.obeserver;

import java.util.ArrayList;
import java.util.List;

public class BankTransactionPublisher implements EventPublisher {
    private final List<EventListener> listeners;

    public BankTransactionPublisher() {
        this.listeners = new ArrayList<>();
    }

    @Override
    public void subscribe(EventListener eventListener) {
        listeners.add(eventListener);
    }

    @Override
    public void notify(Event event) {
        listeners.forEach(listeners -> listeners.update(event));
    }
}
