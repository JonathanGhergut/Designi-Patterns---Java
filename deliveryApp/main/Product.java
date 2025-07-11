package progetto.mp.deliveryApp.main;

public abstract class Product {

	private String product;
	private double cost;

	public Product(String product, double cost) {
		this.product = product;
		this.cost = cost;
	}

	public String getProduct() {
		return product;
	}

	public double getCost() {
		return cost;
	}
	

}
