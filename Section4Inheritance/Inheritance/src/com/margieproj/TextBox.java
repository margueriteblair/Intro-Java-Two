package com.margieproj;


public class TextBox extends UIControl{

    private String text = "";
    // public TextBox() {
    //     super(true);
    //     System.out.println("TextBox");
    // }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override //we tell java that were overriding the toString method from theObject clas
    public void toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}