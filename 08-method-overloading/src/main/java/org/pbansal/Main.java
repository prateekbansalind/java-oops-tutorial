package org.pbansal;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}

// method overloading
// it basically means you have another duplicate method of the same but just some variation on the parameter side.
// use method overloading concept only where it's really needed.
// it's not advisable to overuse as its harder to maintain.
// you can see the example of method overloading in Employee class for calculateWage method.

