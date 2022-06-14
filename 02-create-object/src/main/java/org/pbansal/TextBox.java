package org.pbansal;

public class TextBox {
    // public String text; // field
    // this above way declaring text field without initializing is not the good practice as it can crash the application.
    public String text = "";

    // Method 1
    public void setText(String text){
        this.text = text;
    }

    // Method 2
    public void clear(){
        text = "";
    }
}
