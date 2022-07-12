package org.pbansal;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl();
        control.disable();
        control.isEnabled();

        var text = new Text();
        text.isEnabled();
    }
}

// This exercise is to understand the concept of inheritance.
// Here, we have two class UIControl and Text classes.
// UIControl acts as Parent Class and Text class act as child class.
// The statement in the child class :    "public class Text extends UIControl"
// This means Text class is inheriting properties and method from the UIControl class which are public.
// When we press dot after instantiated object of Text class we will see some other methods too which are shown as default and comes from the object class.



