package src;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;
    public DownloadFileTask() {
        this.status = new DownloadStatus(); //this way, we have a unique downloadstatus object
        //for every new DownloadFileTask
    }
    //part of the downoadfiletask is a download status class which we made
    //we increment the totalbyte 10,000 times because that's how many times the for loop runs
    @Override
    public void run() {
        System.out.println("Downloading a file..." + Thread.currentThread().getName());
        for (var i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        status.done();
        System.out.println("Download complete" + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}