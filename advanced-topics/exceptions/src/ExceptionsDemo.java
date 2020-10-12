package src;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        try {
            var account = new Account();
            account.deposit(-1);
        }
        catch (IOException ex) {
            System.out.println("There is an error!");
        }
    }
}
