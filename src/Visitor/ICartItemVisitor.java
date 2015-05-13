package Visitor;

import Visitor.VisitablesImpl.Cart;
import Visitor.VisitablesImpl.ItemCan;
import Visitor.VisitablesImpl.ItemChicken;
import Visitor.VisitablesImpl.ItemEgg;

public interface ICartItemVisitor {
	public void visit(Cart item);
	public void visit(ItemCan can);
	public void visit(ItemChicken chicken);
	public void visit(ItemEgg egg);
}
