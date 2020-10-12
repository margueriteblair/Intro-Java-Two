package src;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        try {
            var account = new Account();
            account.deposit(-9);
        }
        catch (IOException ex) {
            System.out.println("There is an error!");
            ex.printStackTrace();
            throw ex;
        }
    }
}
