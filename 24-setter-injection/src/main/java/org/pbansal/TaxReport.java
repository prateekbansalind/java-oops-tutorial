package org.pbansal;

public class TaxReport {
    private ITaxCalculator calculator;

    // Constructor Injection
    public TaxReport(ITaxCalculator calculator) {
        this.calculator = calculator;
    }

    // Setter Injection
    public void setCalculator(ITaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
