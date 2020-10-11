package com.margietube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDataBase database;
    private NotificationService notificationService;


    //the below code is the constructor for this java class
    public VideoProcessor(VideoEncoder encoder, VideoDataBase database, NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }
    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }
}