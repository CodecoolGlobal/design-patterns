package com.raczkowski.springintro.behavioral.obeserver;

import java.util.logging.Logger;

public class LoggingEventsListener implements EventListener {
  private static Logger logger = Logger.getLogger(LoggingEventsListener.class.getName());

    @Override
    public void update(Event event) {
        logger.info("Receiving event: " + event.getMessage());
    }
}
