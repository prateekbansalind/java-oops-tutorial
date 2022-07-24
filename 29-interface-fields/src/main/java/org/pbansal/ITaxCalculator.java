package org.pbansal;

public interface ITaxCalculator {
    // double tax = 0.33;
    void calculate();

}

// In interface, we have this facility to introduce and define fields (reference code line number 4) in case if we always want this to be final/constant.
// By default, this field in this interface is final and behaves static.
// We should always avoid to declare initiating field in the interface until if there is any valid reason to do that.
// This field is static public final field. Think about it if we give interface in anywhere in any method as parameter then we can also call this field, and it's
// not right to  do it as why do we want to expose the implementation.
// Just because java implemented this feature it doesn't mean that they are really helpful. WE need to understand the implication of using this.


