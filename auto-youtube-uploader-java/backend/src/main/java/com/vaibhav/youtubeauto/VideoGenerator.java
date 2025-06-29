
package com.vaibhav.youtubeauto;

import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class VideoGenerator {

    public String generateVideoFromTextAndImage(String text, String imagePath, String outputPath) throws IOException, InterruptedException {
        String command = String.format(
            "ffmpeg -loop 1 -i %s -vf drawtext=\"fontfile=/usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf:text='%s':fontcolor=white:fontsize=48:x=(w-text_w)/2:y=(h-text_h)/2\" -t 10 -y %s",
            imagePath, text, outputPath
        );
        Process process = Runtime.getRuntime().exec(command);
        int exitCode = process.waitFor();
        if (exitCode == 0) {
            return outputPath;
        } else {
            throw new IOException("FFmpeg failed to generate video");
        }
    }
}
