package org.pbansal;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        // System.out.println(control);
        var text = new Text();
        // org.pbansal.UIControl@43a25848
        show(control);
        show(text);


    }

    public static void show(UIControl control){
        if (control instanceof Text) {
            var textBox = (Text) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}

/*
* This exercise is to understand upcasting and down-casting
* the method show takes a parameter of an object of UIControl class and prints out the object in toString form on console.
* However, this also works for Text class, see line 7 and 8. Its working because Text class inherits from UIControl class.
* It means Text is a UIControl is ultimately belongs to Object.
* So this concept is Upcasting which means Text class automatically convert or either you can say upcast to UIControl.
*
*
* // If you see the method show declared in line 14 takes UIControl object parameter,
* // this also means that at compile time (compile time means at the time you are writing a code in an editor),
* you will only be able to access the members of UIControl class but not any of its derivatives class.
* Where you have seen in the concept of upcasting that at runtime (runtime means when we execute the code) the derivatives of UIControl has no problem getting
* executed.
* However, this scenario is different, we can see that we have overridden the toString method in Text class so stand alone this show method in line 14 won't
* show the normal output that we are expected to see as we have altered the default toString method.
* So, in this case we need to put some operation on the Text class object which we cannot directly call at to compile time that where we got this concept of
* down casting. So line 15 will allow us to work with the Text object to get the result that we want to get from the toString method.
*
* But there is another issue with this approach that when we pass the UIControl object in the show method, this won't give you any error at compile time as the
* code is correct but fail at the runtime without giving any exception.
* Then what you can do is use the if condition to specify if we are passing any object related to Text class then perform the action which is declared. Refer line no. 16
*
*
* */