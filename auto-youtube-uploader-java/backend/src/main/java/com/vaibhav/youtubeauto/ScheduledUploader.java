
package com.vaibhav.youtubeauto;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@EnableScheduling
@Component
public class ScheduledUploader {

    @Autowired
    private YouTubeService youtubeService;

    private final Queue<VideoUploadRequest> scheduledVideos = new ConcurrentLinkedQueue<>();

    public void scheduleUpload(VideoUploadRequest request) {
        scheduledVideos.add(request);
    }

    @Scheduled(fixedRate = 60000)
    public void uploadScheduledVideos() {
        if (!scheduledVideos.isEmpty()) {
            VideoUploadRequest req = scheduledVideos.poll();
            try {
                youtubeService.uploadVideo(req);
                System.out.println("Scheduled video uploaded: " + req.title);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
