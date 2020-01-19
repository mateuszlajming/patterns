package solution.command;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandTest {

    @Test
    public void lightSwitchCommands() {
        CommandsExecutor commandsExecutor = new CommandsExecutor();

        Light light = new Light();
        assertThat(light.isOn()).isFalse();

        commandsExecutor.setCommand(new SwitchLightOnCommand(light));
        commandsExecutor.executeCommand();

        assertThat(light.isOn()).isTrue();

        commandsExecutor.setCommand(new SwitchLightOffCommand(light));
        commandsExecutor.executeCommand();

        assertThat(light.isOn()).isFalse();
    }
}
