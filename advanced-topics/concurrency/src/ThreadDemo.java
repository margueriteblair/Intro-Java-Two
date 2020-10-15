package src;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());
        //each thread has a name and an id, so we can call either name or id

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}