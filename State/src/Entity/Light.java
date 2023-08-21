package Entity;

import State.OffState;
import State.State;

public class Light {
    private State state;

    public Light() {
        state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnOn() {
        state.turnOn();
    }

    public void turnOff() {
        state.turnOff();
    }

    public void increaseBrightness() {
        state.increaseBrightness();
    }

    public void decreaseBrightness() {
        state.decreaseBrightness();
    }
}
