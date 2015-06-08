package AbstractFactory;

/**
 * The abstract factory pattern provides a way to encapsulate
 * a group of individual factories that have a common theme 
 * without specifying their concrete classes.
 * A factory is the location of a concrete class in the code 
 * at which objects are constructed.
 * [http://en.wikipedia.org/wiki/Abstract_factory_pattern]
 */

public class Main {
	
	public static void main(String[] args) {
		
		AbstractFactory carFactory = FactoryProducer.getFactory(FactoryProducer.TYPE_CAR);
		AbstractFactory engineFactory = FactoryProducer.getFactory(FactoryProducer.TYPE_ENGINE);
		
		ICar merc = carFactory.getCar(ICar.CAR_MERCEDES);
		IEngine mercEng = engineFactory.getEngine(IEngine.ENGINE_MERCEDES);
		merc.drive();
		mercEng.turnOn();
		
		ICar bmw = carFactory.getCar(ICar.CAR_BMW);
		IEngine bmwEng = engineFactory.getEngine(IEngine.ENGINE_BMW);
		bmw.drive();
		bmwEng.turnOn();
		
		/**
		 * Outputs:
		 * 		Driving a Mercedes
		 * 		Gasing a Mercedes engine!
		 * 		Driving a BMW!
		 * 		Gasing a BMW engine!
		 */
		
	}

}
