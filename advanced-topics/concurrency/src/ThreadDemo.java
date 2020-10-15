package src;

import java.util.List;
import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
                status.wait();
                status.notify();
            }
            System.out.println(status.getTotalBytes());
        });
        thread1.start();
        thread2.start();
    }
}