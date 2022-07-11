package org.pbansal;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        var employee1 = new Employee(70_000);
        int wage1 = employee1.calculateWage();
        System.out.println(wage1);
    }
}

// please see the employee class for the description of this constructor overloading concept.


