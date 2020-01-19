package solution.command;

public class Light {
    private boolean isOn = false;

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
