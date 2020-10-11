import java.util.Scanner;
//console class is specifically for reading data from the console
//this is the only time we'll be using a scanner
public class Console {
    private static Scanner scanner = new Scanner(System.in); //making a private scanner local to the class, not an instance
//this scanner instance is only used internally inside this console class

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
        //two static methods, because we only have one console
        //overloading this method
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between" + min + "and" + max);
        }
        return value;
    }
}