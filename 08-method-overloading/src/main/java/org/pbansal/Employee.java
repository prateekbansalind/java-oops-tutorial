package org.pbansal;

public class Employee {

    private int baseSalary;
    private int hourlyPay;

    public Employee(int baseSalary, int hourlyPay){
        setBaseSalary(baseSalary);
        setHourlyPay(hourlyPay);
    }

    public int calculateWage(int extraHours)
    {
        return getBaseSalary() + (extraHours * getHourlyPay());

    }

    // method overloading : we are not passing any extraHours parameter anymore.

    public int calculateWage()
    {
        // return getBaseSalary();
        return calculateWage(0); // that's how you can overload the method with the same method without duplicating the business logic again.
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("base salary cannot be 0 or either -ve.");
        this.baseSalary = baseSalary;
    }

    private int getHourlyPay() {
        return hourlyPay;
    }

    private void setHourlyPay(int hourlyPay) {
        if (hourlyPay <= 0)
            throw new IllegalArgumentException("hourly pay cannot be 0 or either -ve.");
        this.hourlyPay = hourlyPay;
    }
}
