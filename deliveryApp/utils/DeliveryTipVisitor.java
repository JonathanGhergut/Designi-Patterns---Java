package progetto.mp.deliveryApp.utils;

import progetto.mp.deliveryApp.main.Crepes;
import progetto.mp.deliveryApp.main.IceCream;
import progetto.mp.deliveryApp.main.Lemonade;
import progetto.mp.deliveryApp.main.Tea;

public class DeliveryTipVisitor implements ProductVisitor{

	private ProductPrinter printer;
	private double tip;
	
	public DeliveryTipVisitor(ProductPrinter printer, double tip) {
		if(tip <= 0) {
			throw new IllegalArgumentException("You must add a tip for our delivery!");
		}
		
		this.printer = printer;
		this.tip = tip;
	}
	
	@Override
	public void visitIceCream(IceCream iceCream) {
		printer.print("IceCream's cost: €" + iceCream.cost() + 
				"\nThank for your tip: €" + tip );
	}

	@Override
	public void visitCrepes(Crepes crepes) {
		printer.print("Crepes' cost: €" + crepes.cost() + 
				"\nThank for your tip: €" + tip  );	
	}

	@Override
	public void visitLemonade(Lemonade lemonade) {
		printer.print("Lemonade's cost: €" + lemonade.cost() + 
				"\nThank for your tip: €" + tip);
	}

	@Override
	public void visitTea(Tea tea) {
		printer.print("Tea's cost: €" + tea.cost() + 
				"\nThank for your tip: €" + tip);
	}
	
	public double getTip() {
		return tip;
	}

}
