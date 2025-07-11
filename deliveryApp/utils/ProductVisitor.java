package progetto.mp.deliveryApp.utils;

import progetto.mp.deliveryApp.main.Crepes;
import progetto.mp.deliveryApp.main.IceCream;
import progetto.mp.deliveryApp.main.Lemonade;
import progetto.mp.deliveryApp.main.Tea;

public interface ProductVisitor {

	void visitIceCream(IceCream iceCream);
	
	void visitCrepes(Crepes crepes);
	
	void visitLemonade(Lemonade lemonade);
	
	void visitTea(Tea tea);
	
}
