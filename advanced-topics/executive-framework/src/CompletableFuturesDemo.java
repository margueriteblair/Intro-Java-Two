package src;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 20);
        var result = future.thenApply((celsius) -> (celsius * 1.8) + 32); //this method returns a new completable future
        //the result is returned in farenheit
        
    }
}