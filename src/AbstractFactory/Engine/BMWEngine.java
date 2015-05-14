package AbstractFactory.Engine;

import AbstractFactory.IEngine;

public class BMWEngine implements IEngine {
	
	@Override
	public void turnOn() {
		System.out.println("Gasing a BMW engine!");
	}
	
}
