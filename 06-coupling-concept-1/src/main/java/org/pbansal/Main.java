package org.pbansal;

public class Main {
    public static void main(String[] args) {

        // we made getters private in the employee class as their is no need of those methods here in the main class
        // this concept is considered as Abstraction and promotes loose coupling.

        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyPay(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }
}