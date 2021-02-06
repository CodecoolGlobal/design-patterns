package com.raczkowski.springintro.structural.decorator;

public class Main {

    public static void main(String[] args) {
        // Simple consumer loan:
        Credit consumerLoan = new ConsumerLoan();
        System.out.println(consumerLoan);

        // Changing consumer load to mortgage using decorator:
        Credit mortgage = new Mortgage(consumerLoan);
        System.out.println(mortgage);
    }
}
