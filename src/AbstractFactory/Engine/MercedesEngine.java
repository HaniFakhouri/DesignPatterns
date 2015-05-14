package AbstractFactory.Engine;

import AbstractFactory.IEngine;

public class MercedesEngine implements IEngine {
	
	@Override
	public void turnOn() {
		System.out.println("Gasing a Mercedes engine!");
	}

}
