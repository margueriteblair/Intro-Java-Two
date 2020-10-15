package src;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());
        //each thread has a name and an id, so we can call either name or id

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("File is ready to be scanned.");
        }
    }
}