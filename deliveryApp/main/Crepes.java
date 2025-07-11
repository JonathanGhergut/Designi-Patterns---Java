package progetto.mp.deliveryApp.main;

import progetto.mp.deliveryApp.utils.ProductVisitor;

public class Crepes extends Product implements Food {

	public Crepes(String product, double cost) {
		super(product, cost);
	}

	@Override
	public double cost() {
		return super.getCost();
	}

	@Override
	public String product() {
		return super.getProduct();
	}

	@Override
	public void accept(ProductVisitor visitor) {
		visitor.visitCrepes(this);
	}

}
