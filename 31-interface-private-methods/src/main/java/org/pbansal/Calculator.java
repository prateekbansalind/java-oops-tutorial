package org.pbansal;

public class Calculator
        extends AbstractTaxCalculator
        {
    private double income;
    private double tax;

    public Calculator(double income, double tax) {
        this.income = income;
        this.tax = tax;
    }

    public void doSomething(double income, double expense){
        saving(income, expense);
    }

    @Override
    public void calculate() {
        System.out.println(income * tax);
        // System.out.println(income * ITaxCalculator.tax);

    }

}

