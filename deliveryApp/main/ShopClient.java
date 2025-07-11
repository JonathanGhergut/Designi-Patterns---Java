package progetto.mp.deliveryApp.main;

import java.util.ArrayList;

import java.util.Collection;
import java.util.NoSuchElementException;

import progetto.mp.deliveryApp.utils.ColdProductFactory;
import progetto.mp.deliveryApp.utils.DeliveryTipVisitor;
import progetto.mp.deliveryApp.utils.HotProductFactory;
import progetto.mp.deliveryApp.utils.ProductFactory;
import progetto.mp.deliveryApp.utils.ProductInfoVisitor;
import progetto.mp.deliveryApp.utils.ProductPrinter;


public class ShopClient {

	private Collection<Beverage> beverages;
	private Collection<Food> foods;
	private ProductFactory hot ;
	private ProductFactory cold ;
	
	public ShopClient() {
		this.beverages = new ArrayList<>();
		this.foods = new ArrayList<>();
		this.hot  = new HotProductFactory();
		this.cold =  new ColdProductFactory();
	}
	
	Collection<Beverage> getBeverages(){
		return beverages;
	}
	
	Collection<Food> getFoods(){
		return foods;
	}
	
	public void addCrepes() {
		foods.add(hot.orderFood());
	}
	
	public void addIceCream() {
		foods.add(cold.orderFood());
	}
	
	public void addLemonade() {
		beverages.add(cold.orderBeverage());
	}
	
	public void addTea() {
		beverages.add(hot.orderBeverage());
	}
	
	public void removeTea() {
		removeBeverage("Tea");
	}
	
	public void removeLemonade() {
		removeBeverage("Lemonade");
	}
	
	public void removeIceCream() {
		removeFood("IceCream");
	}
	
	public void removeCrepes() {
		removeFood("Crepes");
	}
	
	private void removeBeverage(String product) {
		Beverage bev = beverages.stream()
					.filter(b -> b.product().equals(product))
					.findAny()
					.orElseThrow(
					() -> new NoSuchElementException("This beverage isn't in your shopping cart!"));
		
		beverages.remove(bev);
		
	}
	
	private void removeFood(String product) {
		Food food = foods.stream()
					.filter(f -> f.product().equals(product))
					.findAny()
					.orElseThrow(
					() -> new NoSuchElementException("This food isn't in your shopping cart!"));
		
		foods.remove(food);
	}
	
	public double totalOrderCost() {
		double finalPrice = 0;
		 
		for(Beverage bev : beverages) {
			finalPrice += bev.cost();
		}
		
		for(Food food : foods) {
			finalPrice += food.cost();
		}
		
		return finalPrice;
	}
	
	public void lookAtYourShoppingCart(ProductPrinter printer, ProductInfoVisitor visitor) {
		printer.print("Your shopping cart: ");
		beverages.forEach(b -> b.accept(visitor));
		foods.forEach(f -> f.accept(visitor));
	}
	
	public double totalOrderCostWithDelivery(DeliveryTipVisitor visitor) {
		
		return totalOrderCost() + visitor.getTip();
	}
	
	public long numberOfProductsInShoppingCart() {
		return beverages.stream().count() + foods.stream().count();
	}
	
}
