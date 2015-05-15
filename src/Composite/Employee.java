package Composite;

/**
 * Leaf Composite
 */

public class Employee implements IEmployee {

	private String position;
	
	public Employee(String position) {
		this.position = position;
	}
	
	@Override
	public void print() {
		System.out.println("I am " + position);
	}

}
