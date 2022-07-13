package org.pbansal;

public class Main {
    public static void main(String[] args) {
        var text = new Text();
        System.out.println(text.toString());  // org.pbansal.Text@43a25848 --> output of this line 6

        var text1 = new Text();
        text1.setText("Hello Reader.");
        // System.out.println(text1.toString());  // output: Hello Reader.
        System.out.println(text1);  // output: Hello Reader.

    }
}

/*
* toString() is method offered by Object class and it by default return String.
* It gives fully qualified class name followed by @ sign and then hashCode in hex-decimal form.
* We would like to change this implementation for that we need to use @Override annotation to change the implementation.
* Please see the Text Class to see this Override implementation.
* In the line 10, we don't need to explicitly call toString method as System.out.println will automatically call toString method when passing object to it.
*
*
*
* */