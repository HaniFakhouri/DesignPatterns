package Decorator;

/**
 * Concrete Component 
 */

public class SimpleCar implements Car {

	@Override
	public String getDescription() {
		return "Car";
	}

	@Override
	public int getPrice() {
		return 10000;
	}

}
