package AbstractFactory.Engine;

import AbstractFactory.AbstractFactory;
import AbstractFactory.ICar;
import AbstractFactory.IEngine;

public class EngineFactory extends AbstractFactory {

	@Override
	public ICar getCar(int carType) {
		return null;
	}

	@Override
	public IEngine getEngine(int engineType) {
		if (engineType == IEngine.ENGINE_BMW)
			return new BMWEngine();
		if (engineType == IEngine.ENGINE_MERCEDES)
			return new MercedesEngine();
		return null;
	}

}
