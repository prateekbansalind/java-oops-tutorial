package org.pbansal;

public class Main {
    public static void main(String[] args) {
        TaxCalculator2018 taxCalculator2018 = new TaxCalculator2018(100_000);
        TaxReport taxReport = new TaxReport(taxCalculator2018);
        taxReport.show();
    }
}


// this code is to demonstrate the concept one of the ways of dependency injection. - This is an example of constructor injection.
// this concept means that a class should not instantiate its own object in the another class.
// class should instantiate its object via Constructor injection, Setter injection, or method injection.

// We want both these classes TaxReport and TaxCalculator2018 to be independent of each other.
// This class TaxCalculator2018 implements interface ITaxCalculator and implemented the method the way it wants.
// As per the concept of dependency injection, TaxReport don't directly use any instantiated object of TaxCalculator2018.
// So, TaxReport Class will use interface to create its constructor.
// So if you see the Main class, we can see that we have independently created TaxCalculator2018 object and passes as in the form of interface object into
// TaxReport constructor.

