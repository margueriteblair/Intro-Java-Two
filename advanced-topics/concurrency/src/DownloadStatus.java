package src;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
    }
    //no set total bytes method because it always starts at 0, and we want to increment it
    //we don't want someone to be able to manually reset the byte count
}