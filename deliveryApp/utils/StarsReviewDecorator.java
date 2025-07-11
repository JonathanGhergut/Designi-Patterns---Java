package progetto.mp.deliveryApp.utils;

public class StarsReviewDecorator extends FoodReviewDecorator {

	private String starsReview;

	public StarsReviewDecorator(FoodReview foodReview, String starsReview) {
		super(foodReview);
		this.starsReview = starsReview;
	}

	@Override
	protected void foodDataReview(ProductPrinter printer) {
		//no data in the review
	}

	@Override
	protected void foodStarsReview(ProductPrinter printer) {
		printer.print(starsReview);
	}

}
