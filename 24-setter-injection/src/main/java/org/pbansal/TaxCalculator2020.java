package org.pbansal;

public class TaxCalculator2020 implements ITaxCalculator{

    private double taxIncome;

    public TaxCalculator2020(double taxIncome) {
        this.taxIncome = taxIncome;
    }

    @Override
    public double calculateTax() {
        return taxIncome * 0.5;
    }
}
