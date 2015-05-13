package Visitor;

public interface ICartItem {
	public void accept(ICartItemVisitor visitor);
}
