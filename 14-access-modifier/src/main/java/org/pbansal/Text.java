package org.pbansal;

public class Text extends UIControl {
    private String text = "";

    public Text() {
        super(true);
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}

