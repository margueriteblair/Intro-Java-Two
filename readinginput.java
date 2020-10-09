import java.util.Scanner;

public class readinginput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine().trim(); //you need to call next float or next double
        System.out.println("You're " + name);
    }
}