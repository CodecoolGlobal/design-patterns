package com.raczkowski.springintro.behavioral.obeserver;

public class Main {
    public static void main(String[] args) {
        BankTransactionPublisher transactionPublisher = new BankTransactionPublisher();
        transactionPublisher.subscribe(new LoggingEventsListener());
        transactionPublisher.subscribe(new EmailAlertsListener());

        BankTransactionRegister transactionRegister = new BankTransactionRegister(transactionPublisher);
        transactionRegister.register(new Transaction("Przemek", "Tomek", "3000"));
    }
}
