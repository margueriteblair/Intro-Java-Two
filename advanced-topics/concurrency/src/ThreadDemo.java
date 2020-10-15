package src;

import java.util.List;
import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        //each thread has a name and an id, so we can call either name or id

        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task); //new instance every time the for loop runs
            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            //remember, thread.join() expects InterruptedException error to be thrown, so we need a try catch block
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        var total = tasks.stream()
        .map(t -> t.getStatus().getTotalBytes())
        .reduce(Integer::sum);

        System.out.println(total);
    }
}