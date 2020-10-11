package com.margieproj;

public class Main {
    public static void main(String[] args) {
        // var point1 = new Point(1, 2);
        // var point2 = new Point(1, 2);
        // System.out.println(point1 == point2);
        // System.out.println(point1.equals(point2));
        //in the above case we're working with two different reference objects, therefore two different addresses in space
        //these two instances aren't the same
        //the equals methods compares two objects based on their references;
   
        UIControl[] controls = {new TextBox(), new CheckBox()};

        for (var control : controls) {
            //usually we'd be checking for what type each control is
            //but this can become unmanagable if there's too many types
            //this is where polymorphism comes into play
            control.render();
        }
   
    }
}