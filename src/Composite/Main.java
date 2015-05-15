package Composite;

/**
 * The composite pattern is a partitioning design pattern. 
 * The composite pattern describes that a group of objects is 
 * to be treated in the same way as a single instance of an object. 
 * The intent of a composite is to "compose" objects into tree 
 * structures to represent part-whole hierarchies. Implementing 
 * the composite pattern lets clients treat individual objects 
 * and compositions uniformly.
 * [http://en.wikipedia.org/wiki/Composite_pattern]
 */

public class Main {

	public static void main(String[] args) {

		Employee ceo = new Employee("CEO");

		Employee manager1 = new Employee("Manager 1");
		Employee manager2 = new Employee("Manager 2");

		Employee e1 = new Employee("Employee 1");
		Employee e2 = new Employee("Employee 2");
		Employee e3 = new Employee("Employee 3");
		Employee e4 = new Employee("Employee 4");
		Employee e5 = new Employee("Employee 5");

		Company company = new Company();
		company.add(ceo);

		Company department1 = new Company();
		department1.add(manager1);
		department1.add(e1);
		department1.add(e2);

		Company department2 = new Company();
		department2.add(manager2);
		department2.add(e3);
		department2.add(e4);
		department2.add(e5);

		company.add(department1);
		company.add(department2);

		company.print();
		
		System.out.println();
		
		department1.remove(manager1);
		company.print();

		/**
		 * Outputs:
		 * I am a CEO
		 * I am Manager 1
		 * I am Employee 1
		 * I am Employee 2
		 * I am Manager 2
		 * I am Employee 3
		 * I am Employee 4
		 * I am Employee 5
		 */

	}

}
