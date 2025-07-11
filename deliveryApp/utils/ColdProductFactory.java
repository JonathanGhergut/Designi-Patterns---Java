package progetto.mp.deliveryApp.utils;

import progetto.mp.deliveryApp.main.Beverage;
import progetto.mp.deliveryApp.main.Food;
import progetto.mp.deliveryApp.main.IceCream;
import progetto.mp.deliveryApp.main.Lemonade;

public class ColdProductFactory extends ProductFactory {

	@Override
	public Beverage orderBeverage() {
		return new Lemonade("Lemonade", 4.0);
	}

	@Override
	public Food orderFood() {
		return new IceCream("IceCream",3.5);
	}
	
}
