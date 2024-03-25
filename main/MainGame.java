package main;
import Entity.Player;
import Entity.PlayerFamily;
import Entity.PlayerLove;
import Event.Event01;
import Event.Event02;

import javax.swing.*;
import java.net.URL;

public class MainGame {

    ActionHandler actionHandler = new ActionHandler(this);
    public PlayerFamily playerFamily = new PlayerFamily(this);
    public PlayerLove playerLove = new PlayerLove(this);
    public GameUI gameUI = new GameUI(this, playerFamily);
    public SceneTransition sceneTransition = new SceneTransition(this);
    Sound sound = new Sound();
    Music music = new Music();
    public URL currentMusic;

    public Event01 event01 = new Event01(this);
    public Event02 event02 = new Event02(this);

    public URL mainMenuTheme = getClass().getClassLoader().getResource("Sound/Music/MainMenuTheme.wav");
    public URL countryRoad = getClass().getClassLoader().getResource("Sound/Music/CountryRoad.wav");
    public URL happyTogether = getClass().getClassLoader().getResource("Sound/Music/HappyTogether.wav");
    public URL loveModeTheme = getClass().getClassLoader().getResource("Sound/Music/LoveModeTheme.wav");
    public URL storyOneTheme = getClass().getClassLoader().getResource("Sound/Music/StoryOneTheme.wav");

    public URL tommyNote = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyNote.wav");
    public URL tommyVoice1 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV1.wav");
    public URL tommyVoice2 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV2.wav");
    public URL tommyVoice3 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV3.wav");
    public URL tommyVoice4 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV4.wav");
    public URL tommyVoice5 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV5.wav");
    public URL tommyVoice6 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV6.wav");
    public URL tommyVoice7 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV7.wav");
    public URL tommyVoice8 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV8.wav");
    public URL tommyVoice9 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV9.wav");
    public URL tommyVoice10 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV10.wav");

    public static void main(String[] args) {

        new MainGame();

    }
    public MainGame() {
        sceneTransition.showMainMenu();
    }

    public void playSound(URL url) {
        sound.setFile(url);
        sound.play(url);

    }
    public void stopSound(URL url) {
        sound.stop();
    }
    public void playMusic(URL url) {
        music.setFile(url);
        music.play(url);
        music.loop(url);
    }
    public void stopMusic(URL url) {
        music.stop(url);

    }
}