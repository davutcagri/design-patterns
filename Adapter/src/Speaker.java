public class Speaker implements AudioDevice {
    @Override
    public void playSound(String sound) {
        System.out.println("Playing sound through speakers: " + sound);
    }
}