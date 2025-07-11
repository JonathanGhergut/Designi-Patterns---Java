package progetto.mp.deliveryApp.main;

import progetto.mp.deliveryApp.utils.ProductVisitor;

public interface Food {

	double cost();
	String product();
	void accept(ProductVisitor visitor);

}
