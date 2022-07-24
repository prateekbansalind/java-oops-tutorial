package org.pbansal;

public abstract class AbstractTaxCalculator implements ITaxCalculator{

    protected double saving(double income, double expense) {
        return income - expense;
    }

}
