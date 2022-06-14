package org.pbansal;

public class Main {
    public static void main(String[] args) {

        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyPay = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyPay);
        System.out.println(wage);
       
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyPay
    ){
        return baseSalary + (extraHours * hourlyPay);
    }

}