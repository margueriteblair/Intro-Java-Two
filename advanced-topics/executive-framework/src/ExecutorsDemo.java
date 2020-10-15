package src;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2); //new fixed thread pool and we pass in two threads
        
        try {
            var future = executor.submit(() -> {
            LongTask.simulate();
            return 1;
            });

            System.out.println("Do more work");
            // var result = future.get(); //hovering over it, you can tell the resulting type is integer
            try {
                var result = future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (ExecutionException e) {
                e.printStackTrace();
            }

        } finally {
            executor.shutdown();

        }
    }
}