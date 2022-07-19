package org.pbansal;

public class TaxReport {
    private ITaxCalculator calculator;

    public TaxReport(ITaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
