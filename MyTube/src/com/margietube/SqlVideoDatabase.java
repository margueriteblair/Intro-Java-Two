package com.margietube;

public class SqlVideoDatabase implements VideoDataBase{
    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata in a SQL DB...");
        System.out.println("Title: " + video.getTitle());
        System.out.println("File Name: " + video.getFileName());
        System.out.println("Done!\n");
    }
}