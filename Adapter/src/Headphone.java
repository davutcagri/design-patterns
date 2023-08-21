public class Headphone implements AudioDevice {
    @Override
    public void playSound(String sound) {
        System.out.println("Playing sound through headphones: " + sound);
    }
}