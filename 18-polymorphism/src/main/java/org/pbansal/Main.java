package org.pbansal;

public class Main {
    public static void main(String[] args) {

        UIControl[] controls = { new Text(), new CheckBox() };
        for (var control : controls){
            control.render();
        }

    }

}
// Polymorphism: it means many forms.
// UIControl Class : in this class we declare one method render() but have not defined anything into it. It's an empty method.
// The reason we kept this method empty so that the subclass can have their own way of rendering themselves.
// if we see both the class  Text and CheckBox, you can see that they have overridden the render method and written their own implementation in the method.
