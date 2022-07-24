package org.pbansal;

public class Calculator implements ITaxCalculator{
    private double income;
    private double tax;

    public Calculator(double income, double tax) {
        this.income = income;
        this.tax = tax;
    }


    @Override
    public void calculate() {
        System.out.println(income * tax);
        // System.out.println(income * ITaxCalculator.tax);

    }


}
