package java_Learning.OOPs;

public class Review {

	private String description;
	private double rating;

	public Review(String description, double rating) {
		this.description = description;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("\nRating:[%f]   %s\n", rating, description);
	}

}
