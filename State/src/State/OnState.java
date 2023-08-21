package State;

public class OnState implements State {
    @Override
    public void turnOn() {
        System.out.println("The light is already on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the light!");
    }

    @Override
    public void increaseBrightness() {
        System.out.println("Increasing brightness");
    }

    @Override
    public void decreaseBrightness() {
        System.out.println("Decreasing brightness");
    }
}
