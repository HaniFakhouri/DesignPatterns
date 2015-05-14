package AbstractFactory.Car;

import AbstractFactory.AbstractFactory;
import AbstractFactory.ICar;
import AbstractFactory.IEngine;

public class CarFactory extends AbstractFactory {

	@Override
	public ICar getCar(int carType) {
		if (carType == ICar.CAR_BMW)
			return new BMWCar();
		if (carType == ICar.CAR_MERCEDES)
			return new MercedesCar();
		return null;
	}

	@Override
	public IEngine getEngine(int engineType) {
		return null;
	}

}
