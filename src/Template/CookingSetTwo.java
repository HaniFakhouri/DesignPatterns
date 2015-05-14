package Template;

public class CookingSetTwo extends CookingTemplate {
	
	@Override
	protected void stepOne() {
		System.out.println("Step 1: set two way");
	}

	@Override
	protected void stepTwo() {
		System.out.println("Step 2: set two way");
	}

	@Override
	protected void finalStep() {
		System.out.println("Final step: set two finishing");		
	}
}
