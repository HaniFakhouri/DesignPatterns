package Decorator;

/**
 * Concrete Decorator 
 */

public class CarWithBlackWindowsDecorator extends CarDecorator {

	public CarWithBlackWindowsDecorator(Car car) {
		super(car);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " with black windows";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 1500;
	}

}
