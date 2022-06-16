package org.pbansal;

public class Employee {

    public int baseSalary;
    public int hourlyPay;

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyPay);
    }
}
