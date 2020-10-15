package src;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private volatile boolean isDone;
    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();


    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalFiles() {
        synchronized(totalFilesLock) {
            totalFiles++;
        }
    }

    public void incrementTotalBytes() {
            synchronized(totalBytesLock) {
            totalBytes++;
        }
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