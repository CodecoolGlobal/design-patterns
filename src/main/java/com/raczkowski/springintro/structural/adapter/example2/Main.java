package com.raczkowski.springintro.structural.adapter.example2;

public class Main {

    public static void main(String[] args) {

        ERPAccountancyBusinessSystemImplementation erpAccountancyBusinessSystemImplementation = new ERPAccountancyBusinessSystemImplementation();

        LegacyToERP2AdapterImpl legacyToERP2Adapter = new LegacyToERP2AdapterImpl(erpAccountancyBusinessSystemImplementation);

        legacyToERP2Adapter.submitTimeFor(new Employee(), new MonthReport(), new Project());

    }

}
