package src;

public class ExceptionsDemo {
    public static void show() {
        var reader = new FileReader("file.txt");
        //java compiler knows that it'll throw an exception
        //checked exceptionsare ones we should anticipate
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}