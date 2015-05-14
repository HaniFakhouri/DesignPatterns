package AbstractFactory.Car;

import AbstractFactory.ICar;

public class MercedesCar implements ICar {

	@Override
	public void drive() {
		System.out.println("Driving a Mercedes!");
	}

}
