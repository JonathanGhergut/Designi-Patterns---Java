package progetto.mp.deliveryApp.utils;

import progetto.mp.deliveryApp.main.Beverage;
import progetto.mp.deliveryApp.main.Food;

public abstract class ProductFactory {

	public abstract Beverage orderBeverage();

	public abstract Food orderFood();

}