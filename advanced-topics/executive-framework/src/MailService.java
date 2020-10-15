package src;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send() {
        LongTask.simulate(); //calling the simulate method adds a three second delay to our class
        System.out.println("Mail was sent.");
    }

    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(() -> send());
        //it's run asynchronously because the thread gets run on a separate thread while the other actions in the main thread can continue
    }
}