package Visitor.VisitorImpl;

import Visitor.ICartItemVisitor;
import Visitor.VisitablesImpl.Cart;
import Visitor.VisitablesImpl.ItemCan;
import Visitor.VisitablesImpl.ItemChicken;
import Visitor.VisitablesImpl.ItemEgg;

public class CartOpener implements ICartItemVisitor {

	@Override
	public void visit(Cart item) {
		System.out.println("Opening the cart");
	}

	@Override
	public void visit(ItemCan can) {
		System.out.println("Opening a " + can.getType() + " can");
	}

	@Override
	public void visit(ItemChicken chicken) {
		System.out.println("Opening a chicken");
	}

	@Override
	public void visit(ItemEgg egg) {
		System.out.println("Opening an egg");
	}

}
