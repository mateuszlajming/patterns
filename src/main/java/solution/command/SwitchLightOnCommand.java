package solution.command;

public class SwitchLightOnCommand implements Command {

    private final Light light;

    public SwitchLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
