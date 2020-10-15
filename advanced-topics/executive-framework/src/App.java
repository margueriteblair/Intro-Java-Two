package src;

public class App {
    public static void main(String[] args) throws Exception {
        var service = new MailService();
        service.sendAsync(); //this is a blocking operation
        System.out.println("Hello world"); //this means it'll then take three seconds for hello world to print out
    }
}
