package org.pbansal;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        XVideoEncoder encoder = new XVideoEncoder();
        EmailService service = new EmailService();
        SQLDatabase database = new SQLDatabase();
        VideoProcessor processor = new VideoProcessor(encoder, service, database);
        processor.process(video);
    }
}
