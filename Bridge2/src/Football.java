public class Football extends Sport{
    public Football(PlayingMethod playingMethod) {
        super(playingMethod);
    }

    @Override
    public void play() {
        System.out.println("Playing football using: " + playingMethod.getMethod());
    }
}
