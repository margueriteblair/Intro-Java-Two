package src;

public class LambdasDemo {
    String prefix = "-";
    public static void show() {
        greet(message -> {System.out.println(message);});

        Printer print = new ConsolePrinter();
        Printer printer = message -> System.out.println(message + prefix);
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }
}