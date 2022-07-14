package org.pbansal;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        // default equals method
        System.out.println(point1.equals(point2)); // False as it's checking the address of the object.

        // Overridden equals method - now compare two point objects based on their fields
        System.out.println(point1.equals((point2))); // true

        System.out.println(point1.equals((new Text()))); // false - logic implement in the equals method written in the Point class.

        System.out.println(point1.equals(point1)); // false - logic implemented in the Point class

        // default hashcode gives different values, but we have overridden this method in the Point class.
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());


    }
}
