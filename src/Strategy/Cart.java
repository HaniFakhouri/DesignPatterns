package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Double> items;
	
	public Cart() {
		items = new ArrayList<Double>();
	}
	
	public void addItemPrice(double price) {
		items.add(price);
	}
	
	public double getTotalPrice(IPricingStrategy strategy) {
		return strategy.execute(items);
	}

}
