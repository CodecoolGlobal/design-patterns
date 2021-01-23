package com.raczkowski.springintro.behavioral.obeserver;

public class BankTransactionRegister {

    private final BankTransactionPublisher transactionPublisher;

    public BankTransactionRegister(BankTransactionPublisher transactionPublisher) {
        this.transactionPublisher = transactionPublisher;
    }

    public void register(Transaction transaction) {
        transactionPublisher.notify(new Event(transaction.toString()));
    }

}
