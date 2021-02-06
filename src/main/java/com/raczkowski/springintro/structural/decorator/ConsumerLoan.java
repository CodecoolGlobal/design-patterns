package com.raczkowski.springintro.structural.decorator;

public class ConsumerLoan implements Credit {

    @Override
    public int getInterest() {
        return 15;
    }

    @Override
    public String toString() {
        return "Your interest for current credit is: " + getInterest() + "%";
    }
}
