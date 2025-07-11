package progetto.mp.deliveryApp.main;

import progetto.mp.deliveryApp.utils.ProductVisitor;

public interface Beverage {

	double cost();
	String product();
	void accept(ProductVisitor visitor);
}
