public class StoppedState implements MediaPlayerState {

    private final MediaPlayer mediaPlayer;

    public StoppedState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void play() {
        mediaPlayer.setState(new PlayingState(mediaPlayer));
        System.out.println("Started playing...");
    }

    @Override
    public void stop() {
        System.out.println("[IGNORED] - Already stopped.");
    }
}
