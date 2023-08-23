public class SmartHome {
    private final HomeClimateControl homeClimateControl;
    private final HomeLightingControl homeLightingControl;
    private final HomeSecurityControl homeSecurityControl;

    public SmartHome() {
        this.homeClimateControl = new HomeClimateControl();
        this.homeLightingControl = new HomeLightingControl();
        this.homeSecurityControl = new HomeSecurityControl();
    }

    public void leaveHome() {
        homeSecurityControl.lockDoors();
        homeSecurityControl.setSecurityMode("LEFT");
        homeClimateControl.setMode("COLD");
        homeClimateControl.adjustTemperature(15);
        homeClimateControl.setFanSpeed(400);
        homeLightingControl.turnOffLights();
    }

    public void returnHome() {
        homeSecurityControl.unlockDoors();
        homeSecurityControl.setSecurityMode("BACK");
        homeClimateControl.setMode("WARM");
        homeClimateControl.adjustTemperature(24);
        homeClimateControl.setFanSpeed(700);
        homeLightingControl.turnOnLights();
        homeLightingControl.setBrightness(650);
    }
}
