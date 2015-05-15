package Visitor;

import Visitor.VisitablesImpl.Cart;
import Visitor.VisitorImpl.CartBuyer;
import Visitor.VisitorImpl.CartOpener;

/**
 * The visitor design pattern is a way of separating
 * an algorithm from an object structure on which it
 * operates. A practical result of this separation is
 * the ability to add new operations to existing object
 * structures without modifying those structures.
 * [http://en.wikipedia.org/wiki/Visitor_pattern]
 */

public class Main {
	
	public static void main(String[] args) {
		
		Cart cart = new Cart();
		cart.accept(new CartBuyer());
		cart.accept(new CartOpener());
		
	}

}
