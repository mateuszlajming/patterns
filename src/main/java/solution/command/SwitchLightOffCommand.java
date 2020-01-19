package solution.command;

public class SwitchLightOffCommand implements Command {

    private final Light light;

    public SwitchLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}
