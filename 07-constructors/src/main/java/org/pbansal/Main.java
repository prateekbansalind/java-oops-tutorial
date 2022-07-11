package org.pbansal;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}

// Constructor
// it's helpful to provide higher level of abstraction.
// user doesn't need to recall that what setter are need to call in order to create a correct object.
// we can basically enforce user to provide all the necessary details to create correct object.
