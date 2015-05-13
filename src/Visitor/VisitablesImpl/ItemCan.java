package Visitor.VisitablesImpl;

import Visitor.ICartItem;
import Visitor.ICartItemVisitor;

public class ItemCan implements ICartItem {

	private String type;
	
	public ItemCan(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public void accept(ICartItemVisitor visitor) {
		visitor.visit(this);
	}

}
