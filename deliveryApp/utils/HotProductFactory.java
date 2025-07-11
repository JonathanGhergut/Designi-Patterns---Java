package progetto.mp.deliveryApp.utils;

import progetto.mp.deliveryApp.main.Beverage;
import progetto.mp.deliveryApp.main.Crepes;
import progetto.mp.deliveryApp.main.Food;
import progetto.mp.deliveryApp.main.Tea;

public class HotProductFactory extends ProductFactory {

	@Override
	public Beverage orderBeverage() {
		return new Tea("Tea",4.0);
	}

	@Override
	public Food orderFood() {
		return new Crepes("Crepes",5.0);
	}

}
