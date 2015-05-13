package Visitor.VisitorImpl;

import Visitor.ICartItemVisitor;
import Visitor.VisitablesImpl.Cart;
import Visitor.VisitablesImpl.ItemCan;
import Visitor.VisitablesImpl.ItemChicken;
import Visitor.VisitablesImpl.ItemEgg;

public class CartBuyer implements ICartItemVisitor {

	@Override
	public void visit(Cart item) {
		System.out.println("Buying the cart");
	}

	@Override
	public void visit(ItemCan can) {
		System.out.println("Buying a " + can.getType() + " can");
	}

	@Override
	public void visit(ItemChicken chicken) {
		System.out.println("Buying a chicken");
	}

	@Override
	public void visit(ItemEgg egg) {
		System.out.println("Buying an egg");
	}

}
