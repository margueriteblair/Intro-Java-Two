package src;
//checked or runtime exception
//if checked, have it extend the exception class
//if runtime/unchecked, have it extend the runtimeexception class
public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}