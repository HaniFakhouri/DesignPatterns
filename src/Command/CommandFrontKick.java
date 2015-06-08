package Command;

/** ConcreteCommand 1 */

public class CommandFrontKick implements Command {

	private Fighter fighter;
	
	public CommandFrontKick(Fighter fighter) {
		this.fighter = fighter;
	}

	@Override
	public void execute() {
		fighter.frontKick();
	}

}
