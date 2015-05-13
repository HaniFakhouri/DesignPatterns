package Strategy;

import java.util.List;

public interface IPricingStrategy {
	public double execute(List<Double> itemsList);
}
