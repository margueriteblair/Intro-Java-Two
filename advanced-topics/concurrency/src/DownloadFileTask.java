package src;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;
    public DownloadFileTask(DownloadStatus status) {

    }
    //part of the downoadfiletask is a download status class which we made
    //we increment the totalbyte 10,000 times because that's how many times the for loop runs
    @Override
    public void run() {
        System.out.println("Downloading a file..." + Thread.currentThread().getName());
        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
        System.out.println("Download complete" + Thread.currentThread().getName());
    }
}