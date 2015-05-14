package AbstractFactory;


public abstract class AbstractFactory {		
	public abstract ICar getCar(int carType);
	public abstract IEngine getEngine(int engineType);
}
