public abstract class Sport {
    protected PlayingMethod playingMethod;

    public Sport(PlayingMethod playingMethod) {
        this.playingMethod = playingMethod;
    }

    public abstract void play();
}
