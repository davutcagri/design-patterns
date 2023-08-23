public class PlayingState implements MediaPlayerState{
    private final MediaPlayer mediaPlayer;

    public PlayingState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("[IGNORED] - Already playing!");
    }

    @Override
    public void stop() {
        mediaPlayer.setState(new StoppedState(mediaPlayer));
        System.out.println("Stopped playing.");
    }
}
