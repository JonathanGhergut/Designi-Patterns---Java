package progetto.mp.deliveryApp.utils;

public abstract class FoodReviewDecorator implements FoodReview {

	private FoodReview foodReview;
	
	public FoodReviewDecorator(FoodReview foodReview) {
		this.foodReview = foodReview;
	}
	
	@Override
	public final void review(ProductPrinter printer) {
		foodDataReview(printer);
		foodReview.review(printer);
		foodStarsReview(printer);
	}

	protected abstract void foodDataReview(ProductPrinter printer);

	protected abstract void foodStarsReview(ProductPrinter printer);


}
