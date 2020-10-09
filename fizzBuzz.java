import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to test for FizzBuzz: ");
        int number = scanner.nextInt();
        
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz baby!");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        //if divisible by 5 = fizz
        //if divisible by 3 = buzz
        //if both fizzbuzz
        //if neither return same number
    }
}