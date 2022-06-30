package org.pbansal;

public class Employee {

    private int baseSalary;
    private int hourlyPay;

    public int calculateWage(int extraHours)
    {
        return getBaseSalary() + (extraHours * getHourlyPay());

    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("base salary cannot be 0 or either -ve.");
        this.baseSalary = baseSalary;
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        if (hourlyPay <= 0)
            throw new IllegalArgumentException("hourly pay cannot be 0 or either -ve.");
        this.hourlyPay = hourlyPay;
    }
}
