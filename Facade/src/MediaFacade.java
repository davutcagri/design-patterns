import mediaPlayers.AudioPlayer;
import mediaPlayers.VideoPlayer;

public class MediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;

    public MediaFacade() {
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
    }

    public void playMedia(String audioFile, String videoFile) {
        audioPlayer.playAudio(audioFile);
        videoPlayer.playVideo(videoFile);
    }
}
