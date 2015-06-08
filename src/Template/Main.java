package Template;

/**
 * The template method pattern is a behavioral design pattern
 * that defines the program skeleton of an algorithm in a method,
 * called template method, which defers some steps to subclasses.
 * It lets one redefine certain steps of an algorithm without 
 * changing the algorithm's structure.
 * [http://en.wikipedia.org/wiki/Template_method_pattern]
 */

public class Main {
	
	public static void main(String[] args) {
		
		CookingSetOne chef1 = new CookingSetOne();
		chef1.cook();
		
		CookingSetTwo chef2 = new CookingSetTwo();
		chef2.cook();
		
		CookingSetThree chef3 = new CookingSetThree();
		chef3.cook();
		
		/**
		 * Outputs:
		 * 		Step 1: set one way
		 * 		Step 2: set one way
		 * 		Step 2: set one way
		 *		Step 2: set one way
		 *		Step 3: this is a common step
		 *		Final step: set one finishing
		 *		Step 1: set two way
		 *		Step 2: set two way
		 *		Step 2: set two way
		 *		Step 2: set two way
		 *		Step 3: this is a common step
		 *		Final step: set two finishing
		 *		Step 1: set three way
		 *		Step 2: set three way
		 *		Step 2: set three way
		 *		Step 2: set three way
		 *		Step 3: this is a common step
		 *		Final step: set three finishing
		 */
		
	}

}
