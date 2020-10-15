package src;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;
    private volatile boolean isDone;


    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void incrementTotalFiles() {
            totalFiles++;
    }

    public void incrementTotalBytes() {
            totalBytes.incrementAndGet();
        //lock and unlock method prevent other methods from using the same one
        //good practice to have the finally block to unlock the lock
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
    //no set total bytes method because it always starts at 0, and we want to increment it
    //we don't want someone to be able to manually reset the byte count
}