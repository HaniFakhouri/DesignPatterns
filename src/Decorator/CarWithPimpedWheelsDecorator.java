package Decorator;

/**
 * Concrete Decorator 
 */

public class CarWithPimpedWheelsDecorator extends CarDecorator {

	public CarWithPimpedWheelsDecorator(Car car) {
		super(car);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + " with super wheels";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 3500;
	}

}
