package game.command.keyboard;

public class InputHandler {
	
	Command command;
	
	public InputHandler(Command command) {
		this.command = command;
	}

    public void setCommand() {
        command.execute();

    }
}
