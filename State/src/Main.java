import Entity.Light;
import State.OffState;
import State.OnState;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        light.turnOn();
        light.setState(new OnState());
        light.increaseBrightness();

        light.turnOff();
        light.setState(new OffState());

        light.increaseBrightness();
    }
}