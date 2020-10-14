package src;

public class LambdasDemo {
    public static void show() {

        greet(message -> {System.out.println(message);});
        greet(System.out::println); //this line is equivalent to the above line
        //Class/Object::method
        greet(message -> print(message));
        greet(LambdasDemo::print);
        var demo =new LambdasDemo();
        greet(message -> demo.print(message));
        greet(demo::print);
    }
    public void print(String message) {}


    public static void greet(Printer printer) {
        printer.print("Hello world");
    }
}