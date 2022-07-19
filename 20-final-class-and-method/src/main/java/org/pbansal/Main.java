package org.pbansal;

public class Main {
    public static void main(String[] args) {

        UIControl[] controls = { new Text(), new CheckBox() };
        for (var control : controls){
            control.render();
        }

    }

}

// Concept of final class and methods
// Please refer to the CheckBox class for more details.