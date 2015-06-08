package Command;

/**
 * The command pattern is a behavioral design pattern 
 * in which an object is used to encapsulate all information
 * needed to perform an action or trigger an event at a later 
 * time.
 * Four terms always associated with the command pattern are 
 * command, receiver, invoker and client.
 * [http://en.wikipedia.org/wiki/Command_pattern]
 */

/** Invoker */

public class Main {
	
	public static void main(String[] args) {
		
		// Receiver
		Fighter fighter = new Fighter();
		
		// Invoker
		// The invoker has no idea what command shall be executed, it just
		// executes the command passed to it.
		// In other words the receiver and the invoker are decoupled.
		Joystick joystick = new Joystick();
		
		joystick.execute(new CommandHighKick(fighter) /*Command*/);
		joystick.execute(new CommandFrontKick(fighter) /*Command*/);
		joystick.execute(new CommandSuperKick(fighter) /*Command*/);
		joystick.execute(new CommandFrontKick(fighter) /*Command*/);
		
		/**
		 * Outputs:
		 * 		High kick
		 * 		Front kick
		 * 		Front kick
		 * 		Super kick
		 */
		
	}

}
