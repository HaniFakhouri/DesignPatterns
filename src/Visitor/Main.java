package Visitor;

import Visitor.VisitablesImpl.Cart;
import Visitor.VisitorImpl.CartBuyer;
import Visitor.VisitorImpl.CartOpener;

/**
 * Inspired from http://en.wikipedia.org/wiki/Visitor_pattern
 */

public class Main {
	
	public static void main(String[] args) {
		
		Cart cart = new Cart();
		cart.accept(new CartBuyer());
		cart.accept(new CartOpener());
		
	}

}
