package java_Learning.OOPs;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String bookName;
	private String author;
	private List<Review> review;

	public Book(int id, String bookName, String author) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.review = new ArrayList<>();
	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	@Override
	public String toString() {

		return String.format("Book name:%s\nBook id:%d\nBook Author:%s\nBook Review:%s", bookName, id, author, review);
	}

}
