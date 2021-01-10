package com.raczkowski.springintro.structural.adapter.example1;

public class KPHtoMPHAdapter implements KPHAdapter {

    private Movable luxuryCars;

    public KPHtoMPHAdapter(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getKPH() {
        return convertMPHtoKMPH(luxuryCars.getMPH());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

}
