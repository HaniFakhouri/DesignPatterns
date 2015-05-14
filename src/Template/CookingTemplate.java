package Template;

public abstract class CookingTemplate {

	protected abstract void stepOne();
	protected abstract void stepTwo();
	
	protected void stepThree() {
		System.out.println("Step 3: this is a common step");
	}
	
	protected abstract void finalStep();
	
	public void cook() {
		stepOne();
		for (int i=0; i<3; i++)
			stepTwo();
		stepThree();
		finalStep();
	}
	
}
