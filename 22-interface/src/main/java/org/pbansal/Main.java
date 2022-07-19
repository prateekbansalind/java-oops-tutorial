package org.pbansal;

public class Main {
    public static void main(String[] args) {
        TaxReport report = new TaxReport();
        report.show();
    }
}


// this code is to demonstrate the concept of dependency injection.
// this concept means that a class should not instantiate its own object in the another class.
// class should instantiate its object via Constructor injection, Setter injection, or method injection.