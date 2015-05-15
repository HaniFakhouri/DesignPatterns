package Decorator;

/**
 * Decorator
 */

public abstract class CarDecorator extends SimpleCar {

	private Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	@Override
	public String getDescription() {
		return car.getDescription();
	}

	@Override
	public int getPrice() {
		return car.getPrice();
	}
	
}
