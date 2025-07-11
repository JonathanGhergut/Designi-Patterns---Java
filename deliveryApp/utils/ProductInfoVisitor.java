package progetto.mp.deliveryApp.utils;

import progetto.mp.deliveryApp.main.Crepes;
import progetto.mp.deliveryApp.main.IceCream;
import progetto.mp.deliveryApp.main.Lemonade;
import progetto.mp.deliveryApp.main.Tea;

public class ProductInfoVisitor implements ProductVisitor {

	private ProductPrinter printer;
	
	public ProductInfoVisitor(ProductPrinter printer) {
		this.printer = printer;
	}
	
	@Override
	public void visitIceCream(IceCream iceCream) {
		printer.print("IceCream, with cost: " + iceCream.cost());

	}

	@Override
	public void visitCrepes(Crepes crepes) {
		printer.print("Crepes, with cost: " + crepes.cost());

	}

	@Override
	public void visitLemonade(Lemonade lemonade) {
		printer.print("Lemonade, with cost: " + lemonade.cost());

	}

	@Override
	public void visitTea(Tea tea) {
		printer.print("Tea, with cost: " + tea.cost());

	}

}
