package org.pbansal;

public abstract class UIControl {
    private boolean isEnabled = true;

    public UIControl() {
    }

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

    public abstract void render();
}

