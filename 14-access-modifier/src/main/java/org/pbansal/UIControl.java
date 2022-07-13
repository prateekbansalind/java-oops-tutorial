package org.pbansal;

public class UIControl {
    // protected boolean isEnabled = true;
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public boolean enable(){
        return this.isEnabled = true;
    }

    public boolean disable(){
        return  this.isEnabled = false;
    }

    public void isEnabled(){
        System.out.println(isEnabled);
    }

}
