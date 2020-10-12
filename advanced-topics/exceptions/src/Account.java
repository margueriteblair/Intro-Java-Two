package src;

import java.io.IOException;

public class Account {
    private float balance;
    //declare private variables first, then our public methods
    public void deposit(float value) throws IOException{
        if (value <= 0) {
            throw new IOException();
        }
    }

    public void withdraw(float value) throws InsufficientFundsException {
        if (value > balance) {
            throw new InsufficientFundsException("Why won't this work???");
        }
    }
}