package org.pbansal;

public class TaxCalculator2018 implements ITaxCalculator{
    private double taxIncome;

    public TaxCalculator2018(double taxIncome) {
        this.taxIncome = taxIncome;
    }

    @Override
    public double calculateTax(){
        return taxIncome * 0.3;
    }
}
