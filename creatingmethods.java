public class creatingmethods {
    public static void main(String[] args) {
        //greet method within main method
        String message = greetUser("Margie", "Blair");
        System.out.println(message);
    }

    public static String greetUser(String firstName, String lastName) {
        return ("Hello " + firstName + " " + lastName);
    }
    //creating methods keeps code DRY
}