package AbstractFactory;

import AbstractFactory.Car.CarFactory;
import AbstractFactory.Engine.EngineFactory;

public class FactoryProducer {
	
	public static final int TYPE_CAR = 0;
	public static final int TYPE_ENGINE = 1;
	
	public static AbstractFactory getFactory(int factoryType) {
		if (factoryType == TYPE_CAR)
			return new CarFactory();
		if (factoryType == TYPE_ENGINE)
			return new EngineFactory();
		return null;
	}

}
