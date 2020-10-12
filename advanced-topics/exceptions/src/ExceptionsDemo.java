package src;

public class ExceptionsDemo {
    public static void show() {
            var account = new Account();
            try {
                account.withdraw(10);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
    }
}
