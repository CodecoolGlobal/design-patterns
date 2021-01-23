package com.raczkowski.springintro.behavioral.obeserver;

public class Transaction {
    private final String from;
    private final String to;
    private final String amount;

    public Transaction(String from, String to, String amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
