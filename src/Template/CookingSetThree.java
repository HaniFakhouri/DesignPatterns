package Template;

public class CookingSetThree extends CookingTemplate {
	
	@Override
	protected void stepOne() {
		System.out.println("Step 1: set three way");
	}

	@Override
	protected void stepTwo() {
		System.out.println("Step 2: set three way");
	}

	@Override
	protected void finalStep() {
		System.out.println("Final step: set three finishing");	
	}

}
