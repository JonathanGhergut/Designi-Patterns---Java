package progetto.mp.deliveryApp.utils;

import progetto.mp.deliveryApp.main.Food;

public class ClientReview implements FoodReview {

	private String message;
	private Food food;
	
	public ClientReview(String message, Food food) {
		this.message = message;
		this.food = food;
	}
	
	@Override
	public void review(ProductPrinter printer) {
		printer.print("About " + food.product() + ": " + message);
		
	}

	

}
