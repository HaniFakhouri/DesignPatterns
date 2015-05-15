package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composition
 */

public class Company implements IEmployee {
	
	private List<IEmployee> employees;
	
	public Company() {
		employees = new ArrayList<IEmployee>();
	}
	
	public void add(IEmployee e) {
		employees.add(e);
	}
	
	public void remove(IEmployee e) {
		employees.remove(e);
	}

	@Override
	public void print() {
		for (IEmployee e : employees)
			e.print();
	}

}
