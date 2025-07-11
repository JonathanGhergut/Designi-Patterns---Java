package progetto.mp.deliveryApp.main;

import progetto.mp.deliveryApp.utils.ProductVisitor;

public class Lemonade extends Product implements Beverage {

	public Lemonade(String product, double cost) {
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
		visitor.visitLemonade(this);
	}

}
