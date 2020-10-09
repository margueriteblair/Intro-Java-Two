import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
        } while (!input.equals("quit"));
    }
    //do while always executes at least once
}