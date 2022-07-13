package org.pbansal;

// package org.prateekbansal;

// import org.pbansal.Text;
// import org.pbansal.UIControl;

public class Main {
    public static void main(String[] args) {
        var text = new Text();
        text.isEnabled();

        // boolean val = new UIControl(false).isEnabled;
    }
}

/*
* 1. This is a exercise to understand access modifier.
* 2. In the UIControl Class we have one private field called isEnabled.
* 3. So this private access modifier restricts to get this field
* if we try to call this field in subclasses or even the instantiated object of the same class this field is member of.
* 4. This provides a better abstraction.
*
*5. Another access modifier is protected which provides any field/method to be accessed in the same package but restricts in different package.
*6. This protected access modifier is like a code smell, we should mostly avoid it but only uses it when is it really required.
*
*7. Another thing, this is really confusing, for example we declare one field protected in the UIControl class and say the package is org.pbansal
*8. The Text class inherits to UIControl Class but Text Class in a different package say org.prateekbansal then Text Class would be able to access the
* protect field declared in UIControl Class. So this concept is quite confusing and should be avoided if possible.
*
*9. If we don't assign any access modifier to the fields on the class then by default they will be public within the package but behaves private if the class
* used in different package.
* */
