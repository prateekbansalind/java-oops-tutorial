package org.pbansal;

public class Text extends UIControl {
    private String text = "";

    public Text() {
        super(true);
        System.out.println("Text");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}


/*
* public Text() {
        System.out.println("Text");
    }
*
* There is no default constructor available in org.pbansal.UIControl
*
*In this case, as Text class inherits from the UIControl class and UIControl doesn't have any default constructor then we need to
* mention the same constructor that we have in the UIControl into Text class with the help of Super keyword.
* This keyword basically calls the constructor mentioned in UIControl Class.
*
* */