package org.pbansal;

public final class CheckBox extends UIControl {

    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}

// public class MyCheckBox extends CheckBox{}



// CheckBox class as final prevents any class to extend this class.
// This is some time beneficial but prevents the concepts of inheritance.
// Classes like String is final and cannot be extended as its members like methods are immutable.
// Methods can also be made as final to prevent its extension.
// Refer the example of final class in the UIControl class where method called enable() is defined as final and
// cannot be used by any other class.


