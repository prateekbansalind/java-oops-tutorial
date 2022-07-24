package org.pbansal;

public class VideoProcessor {
    private VideoEncoder encoder;
    private NotificationService service;
    private VideoDatabase database;

    public VideoProcessor(VideoEncoder encoder, NotificationService service, VideoDatabase database) {
        this.encoder = encoder;
        this.service = service;
        this.database = database;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        service.sendEmail(video.getUser());
    }
}

