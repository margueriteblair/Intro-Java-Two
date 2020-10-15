package src;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file..." + Thread.currentThread().getName());
        try{
            Thread.sleep(5000); //suspends the current thread for 5 seconds or 5000 milliseconds
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download complete" + Thread.currentThread().getName());
    }
}