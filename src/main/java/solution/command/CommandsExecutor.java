package solution.command;

public class CommandsExecutor {
    private Command command;

    public void executeCommand() {
        if(command == null) {
            throw new IllegalStateException();
        }
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
