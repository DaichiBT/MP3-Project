package main;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Music {
    Clip clip;

    public Music() {
        //soundURL[0] = getClass().getResource(insertFileDirectory);

    }

    public void setFile(URL name) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(name);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void play(URL name) {
        clip.setFramePosition(0);
        clip.start();
    }

    public void loop(URL url) {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(URL url) {
        clip.stop();
    }
}