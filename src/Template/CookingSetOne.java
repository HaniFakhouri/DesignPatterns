package Template;

public class CookingSetOne extends CookingTemplate {

	@Override
	protected void stepOne() {
		System.out.println("Step 1: set one way");
	}

	@Override
	protected void stepTwo() {
		System.out.println("Step 2: set one way");
	}

	@Override
	protected void finalStep() {
		System.out.println("Final step: set one finishing");		
	}

}
