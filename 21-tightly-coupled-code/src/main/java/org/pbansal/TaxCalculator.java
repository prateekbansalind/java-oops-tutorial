package org.pbansal;

public class TaxCalculator {
    private double taxIncome;

    public TaxCalculator(double taxIncome) {
        this.taxIncome = taxIncome;
    }

    public double calculateTax(){
        return taxIncome * 0.3;
    }
}
