package org.pbansal;

public class Main {
    public static void main(String[] args) {
        TaxReport report = new TaxReport();
        report.show();
    }
}


// This code demonstrates the example of tightly coupled code which is not good as one class depends on another.
// TaxReport class totally depends on TaxCalculator.
// So, this dependency can be reduced with the help of implementing interface.