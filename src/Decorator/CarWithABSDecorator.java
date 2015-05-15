package Decorator;

/**
 * Concrete Decorator 
 */

public class CarWithABSDecorator extends CarDecorator {

	public CarWithABSDecorator(Car car) {
		super(car);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " with ABS breaks";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 500;
	}

}
