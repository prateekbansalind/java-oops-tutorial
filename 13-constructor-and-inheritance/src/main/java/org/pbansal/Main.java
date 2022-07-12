package org.pbansal;

public class Main {
    public static void main(String[] args) {
        var text = new Text();

        var control = new UIControl(false);
        control.isEnabled();

    }
}

// please see the description of this concept in the Text Class.
// We have used this "Super" keyword in case if your one class depends on another one.
// and that class has certain kind of constructor whose info is not there in the class which inherits from it then
// we can use Super keyword to handle that and basically inherit the constructor to into that class.

