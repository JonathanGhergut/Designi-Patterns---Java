package progetto.mp.deliveryApp.utils;

public class DataReviewDecorator extends FoodReviewDecorator {

	private String dataReview;

	public DataReviewDecorator(FoodReview foodReview, String dataReview) {
		super(foodReview);
		this.dataReview = dataReview;
	}

	@Override
	protected void foodDataReview(ProductPrinter printer) {
		printer.print(dataReview);
	}

	@Override
	protected void foodStarsReview(ProductPrinter printer) {
		//no stars in the review
	}

}
