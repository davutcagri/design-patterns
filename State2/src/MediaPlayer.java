public class MediaPlayer {
    private MediaPlayerState state;

    public MediaPlayer() {
        state = new StoppedState(this);
    }

    public void setState(MediaPlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play();
    }

    public void stop() {
        state.stop();
    }
}
