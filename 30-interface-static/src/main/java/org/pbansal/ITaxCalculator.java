package org.pbansal;

public interface ITaxCalculator {
    // double tax = 0.33;
    void calculate();

//    static double saving(double income, double expense) {
//        return income - expense;
//    }
}

// In interface, we should try not to define the method.
// interface should only be used to define what to implement by the class who will implement this interface
// the code line 7 to 9 is irrelevant here and not the right way of declaring this.