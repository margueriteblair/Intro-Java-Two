package src;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2); //new fixed thread pool and we pass in two threads
        
        try {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });

        } finally {
            executor.shutdown();

        }
    }
}