package AbstractFactory;


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
		
	}

}
