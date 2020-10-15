package src;

import java.util.List;
import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        //each thread has a name and an id, so we can call either name or id

        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
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
        System.out.println(status.getTotalBytes());
    }
}