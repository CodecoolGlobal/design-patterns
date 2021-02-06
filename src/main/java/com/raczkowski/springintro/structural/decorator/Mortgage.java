package com.raczkowski.springintro.structural.decorator;

public class Mortgage implements Credit {

    private final Credit consumerLoan;

    public Mortgage(Credit consumerLoan) {
        this.consumerLoan = consumerLoan;
    }

    @Override
    public int getInterest() {
        return consumerLoan.getInterest() + 10;
    }

    @Override
    public String toString() {
        return "Your interest for current credit is: " + getInterest() + "%";
    }
}
