package org.pbansal;

public class Main {
    public static void main(String[] args) {

        UIControl[] controls = { new Text(), new CheckBox() };
        for (var control : controls){
            control.render();
        }

    }

}

// abstract class and method
// We have kept the UIControl class as abstract so that we cannot instantiate the object of it.
// Abstract method in the abstract class will force their subclass to implement the abstract method by overriding it.
// When we make any method abstract, we don't need to use curly brackets. It makes sense too as we're not defining anything in the method.
// public abstract returnType methodName();