public class Main {
    public static void main(String[] args) {
        AudioDevice speaker = new Speaker();
        AudioDevice headphone = new Headphone();

        BluetoothSpeaker bluetoothSpeaker = new BluetoothSpeaker();
        AudioDevice bluetoothAdapter = new BluetoothSpeakerAdapter(bluetoothSpeaker);

        playAudio(speaker);
        playAudio(headphone);
        playAudio(bluetoothAdapter);
    }

    public static void playAudio(AudioDevice device) {
        device.playSound("Sample sound");
    }
}