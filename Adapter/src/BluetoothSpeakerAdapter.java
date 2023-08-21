public class BluetoothSpeakerAdapter implements AudioDevice {
    private BluetoothSpeaker bluetoothSpeaker;

    public BluetoothSpeakerAdapter(BluetoothSpeaker bluetoothSpeaker) {
        this.bluetoothSpeaker = bluetoothSpeaker;
    }

    @Override
    public void playSound(String sound) {
        bluetoothSpeaker.playBluetoothSound(sound);
    }
}