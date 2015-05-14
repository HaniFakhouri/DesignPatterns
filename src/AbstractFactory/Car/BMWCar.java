package AbstractFactory.Car;

import AbstractFactory.ICar;

public class BMWCar implements ICar {

	@Override
	public void drive() {
		System.out.println("Driving a BMW!");
	}

}
