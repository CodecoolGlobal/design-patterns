package com.raczkowski.springintro.behavioral.obeserver;

public interface EventPublisher {

    void subscribe(EventListener eventListener);

    void notify(Event event);

}
