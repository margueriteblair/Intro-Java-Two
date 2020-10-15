package src;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        lock.lock();
        try {
            totalBytes++;
        } finally{
            lock.unlock();
        }
        //lock and unlock method prevent other methods from using the same one
        //good practice to have the finally block to unlock the lock
    }
    //no set total bytes method because it always starts at 0, and we want to increment it
    //we don't want someone to be able to manually reset the byte count
}