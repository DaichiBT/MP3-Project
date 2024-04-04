package main;
import Entity.PlayerFamily;
import Entity.PlayerLove;
import Event.Event01;
import Event.Event02;

import java.net.URL;

public class MainGame {

    ActionHandler actionHandler = new ActionHandler(this);
    public PlayerFamily playerFamily = new PlayerFamily(this);
    public PlayerLove playerLove = new PlayerLove(this);
    public GameUI gameUI = new GameUI(this, playerFamily);
    SceneTransition sceneTransition = new SceneTransition(this);
    Sound sound = new Sound();
    Music music = new Music();

    Event01 event01 = new Event01(this);
    Event02 event02 = new Event02(this);

    private final URL mainMenuTheme = getClass().getClassLoader().getResource("Sound/Music/MainMenuTheme.wav");
    private final URL countryRoad = getClass().getClassLoader().getResource("Sound/Music/CountryRoad.wav");
    private final URL happyTogether = getClass().getClassLoader().getResource("Sound/Music/HappyTogether.wav");
    private final URL loveModeTheme = getClass().getClassLoader().getResource("Sound/Music/LoveModeTheme.wav");
    private final URL storyOneTheme = getClass().getClassLoader().getResource("Sound/Music/StoryOneTheme.wav");

    private final URL tommyNote = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyNote.wav");
    private final URL tommyVoice1 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV1.wav");
    private final URL tommyVoice2 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV2.wav");
    private final URL tommyVoice3 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV3.wav");
    private final URL tommyVoice4 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV4.wav");
    private final URL tommyVoice5 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV5.wav");
    private final URL tommyVoice6 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV6.wav");
    private final URL tommyVoice7 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV7.wav");
    private final URL tommyVoice8 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV8.wav");
    private final URL tommyVoice9 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV9.wav");
    private final URL tommyVoice10 = getClass().getClassLoader().getResource("Sound/VoiceLines/TommyV10.wav");

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
    public URL getMainMenuTheme() {
        return mainMenuTheme;
    }
    public URL getCountryRoad() {
        return countryRoad;
    }
    public URL getHappyTogether() {
        return happyTogether;
    }
    public URL getLoveModeTheme() {
        return loveModeTheme;
    }
    public URL getStoryOneTheme() {
        return storyOneTheme;
    }
    public URL getTommyNote() {
        return tommyNote;
    }
    public URL getTommyVoice(int i) {
        return switch (i) {
            case 2 -> tommyVoice2;
            case 3 -> tommyVoice3;
            case 4 -> tommyVoice4;
            case 5 -> tommyVoice5;
            case 6 -> tommyVoice6;
            case 7 -> tommyVoice7;
            case 8 -> tommyVoice8;
            case 9 -> tommyVoice9;
            case 10 -> tommyVoice10;
            default -> tommyVoice1;
        };
    }

}