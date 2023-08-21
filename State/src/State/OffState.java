package State;

public class OffState implements State {

    @Override
    public void turnOn() {
        System.out.println("Turning on the light!");
    }

    @Override
    public void turnOff() {
        System.out.println("The light is already off!");
    }

    @Override
    public void increaseBrightness() {
        // Işık kapalı olduğu için parlaklık arttırılamaz.
    }

    @Override
    public void decreaseBrightness() {
        // Işık kapalı olduğu için parlaklık azaltılamaz.
    }
}
