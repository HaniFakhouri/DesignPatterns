package Visitor.VisitablesImpl;

import Visitor.ICartItem;
import Visitor.ICartItemVisitor;

public class Cart implements ICartItem {

	private ICartItem[] items;
	
	public Cart() {
		items = new ICartItem[]
				{
					new ItemCan("Milk"), new ItemCan("Cola"),
					new ItemCan("Water"), new ItemChicken(),
					new ItemEgg(),
				};
	}
	
	@Override
	public void accept(ICartItemVisitor visitor) {
		for (ICartItem item : items)
			item.accept(visitor);
		visitor.visit(this);
	}

}
