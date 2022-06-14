package org.pbansal;

public class Main {
    public static void main(String[] args) {
        // In this module, we have created object of TextBox class.
        var textBox1 = new TextBox();
        // textBox1.setText("hello world!"); if this line doesn't initiate the text field with any value then by default as text is an object of String class which is reference type would return us null.
        // This is not a good practice, if String field is not initiated and if any string methods are applied on that field, it will give a NullPointerExecption which will eventually crash your application.
        textBox1.setText("hello world!");
        System.out.println(textBox1.text);
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Hello Java.");
        System.out.println(textBox2.text);
    }

}