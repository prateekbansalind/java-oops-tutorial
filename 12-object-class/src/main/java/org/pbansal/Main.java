package org.pbansal;

public class Main {
    public static void main(String[] args) {
        var o1 = new Object();
        System.out.println("o1 hashcode" + ": " + o1.hashCode());

        var o2 = o1;
        System.out.println("o2 hashcode" + ": " + o2.hashCode());
        System.out.println("o1 equals o2: " +  o2.equals(o1));

        var o3 = new Object();
        var o4 = new Object();
        System.out.println("o3 hashcode" + ": " + o3.hashCode());
        System.out.println("o4 hashcode" + ": " + o4.hashCode());
        System.out.println("o3 equals o4: " + o3.equals(o4));

        System.out.printf("o1 as toString: " + o1.toString());
    }
}

// Any class created in Java extends to Object class. It's a part of Java.lang package.
// It means they inherit all the exposed public method from the Object class.
// Most common methods of Object class are hashCode, equals and toString.
// hashCode : this method basically gives the address of that object in the memory, but it's not purely true.
// Actually, when we use this hashCode method, this object has been sent to hash function which give hashcode as outcome.
// equals: This method is useful if we want to compare address between the two object to see if they are referring same address in the memory.
// This is not the case always for example if we have Pointer class which has two fields x and y and if we have two objects of same class with same x and y value.
// But they are two different object but contains the same contents but still they are different in terms of their address in the memory. In this case we can still
// compare them by altering this equals method in Object class.
// toString: this method gives full address of the object instantiated from the parent class in this example Object class.
// We can see that it's a part of this class java.lang.Object and then followed by "@" sign, and then we have hashCode in Hex-Decimal Form.
// This toString method can also be changes as equals method in a way we want.


