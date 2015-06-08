package Command;

/** ConcreteCommand 2 */

public class CommandHighKick implements Command {
	
	private Fighter fighter;
	
	public CommandHighKick(Fighter fighter) {
		this.fighter = fighter;
	}

	@Override
	public void execute() {
		fighter.highKick();
	}

}
