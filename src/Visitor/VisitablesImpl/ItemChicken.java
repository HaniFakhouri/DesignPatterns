package Visitor.VisitablesImpl;

import Visitor.ICartItem;
import Visitor.ICartItemVisitor;

public class ItemChicken implements ICartItem {

	@Override
	public void accept(ICartItemVisitor visitor) {
		visitor.visit(this);
	}

}
