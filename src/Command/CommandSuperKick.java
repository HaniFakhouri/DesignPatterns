package Command;

/** ConcreteCommand 3 */

public class CommandSuperKick implements Command {
	
	private Fighter fighter;
	
	public CommandSuperKick(Fighter fighter) {
		this.fighter = fighter;
	}

	@Override
	public void execute() {
		fighter.superKick();
	}
	
}
