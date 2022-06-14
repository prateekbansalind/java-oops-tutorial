package org.pbansal;

public class TextBox {
    public String text; // field

    // Method 1
    public void setText(String text){
        this.text = text;
    }

    // Method 2
    public void clear(){
        text = "";
    }
}
