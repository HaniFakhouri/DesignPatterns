package Decorator;

/**
 * 
 *  The decorator pattern is a design pattern that allows behavior to be added 
 *  to an individual object, either statically or dynamically, without affecting
 *  the behavior of other objects from the same class.
 *  [http://en.wikipedia.org/wiki/Decorator_pattern]
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new SimpleCar();
		Car car2 = new CarWithBlackWindowsDecorator(new SimpleCar());
		Car car3 = new CarWithABSDecorator(new SimpleCar());
		Car car4 = new CarWithBlackWindowsDecorator(
					   new CarWithABSDecorator(
						   new CarWithPimpedWheelsDecorator(
							   new SimpleCar())));
		
		System.out.println(car1.getDescription() + ": " + car1.getPrice());
		System.out.println(car2.getDescription() + ": " + car2.getPrice());
		System.out.println(car3.getDescription() + ": " + car3.getPrice());
		System.out.println(car4.getDescription() + ": " + car4.getPrice());
		
		/**
		 * Outputs:
		 * Car: 10000
		 * Car with black windows: 11500
		 * Car with ABS breaks: 10500
		 * Car with super wheels with ABS breaks with black windows: 15500
		 */
		
	}
	
}
