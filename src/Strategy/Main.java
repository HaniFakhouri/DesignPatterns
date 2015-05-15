package Strategy;

/**
 * The strategy pattern (also known as the policy pattern) 
 * is a software design pattern that enables an algorithm's 
 * behavior to be selected at runtime.
 * [http://en.wikipedia.org/wiki/Strategy_pattern]
 */

public class Main {
	
	public static void main(String[] args) {
		
		Cart cart = new Cart();
		
		cart.addItemPrice(10);
		cart.addItemPrice(20);
		cart.addItemPrice(15.5);
		
		System.out.println("Alfa pricing:  " + cart.getTotalPrice(new AlfaPrice()));
		System.out.println("Beta pricing:  " + cart.getTotalPrice(new BetaPrice()));
		System.out.println("Gamma pricing: " + cart.getTotalPrice(new GammaPrice()));
		
	}

}
