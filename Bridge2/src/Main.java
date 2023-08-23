public class Main {
    public static void main(String[] args) {
        PlayingMethod indoorPlayingMethod = new IndoorPlayingMethod();
        PlayingMethod outdoorPlayingMethod = new OutdoorPlayingMethod();
        Sport futsal = new Football(indoorPlayingMethod);
        futsal.play();
        Sport soccer = new Football(outdoorPlayingMethod);
        soccer.play();
    }
}