package com.margietube;
//most of this program is to practice appropriately placing interfaces
public class App {
    public static void main(String[] args) {
        var video = new Video(); //create new instance of a video
        video.setFileName("birthday.mp4");
        video.setTitle("Margie's Birthday!");
        video.setUser(new User("margie@gmail.com"));

        var processor = new VideoProcessor(new XVideoEncoder(), new SqlVideoDatabase(), new EmailService());
        processor.process(video);
    }
}
