package com.codewithmosh;

public class createclass {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box1");

        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
    }
}