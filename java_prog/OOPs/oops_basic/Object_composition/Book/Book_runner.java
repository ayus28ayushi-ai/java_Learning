package java_Learning.OOPs;

public class Book_runner {
	public static void main(String[] args) {
	Book book = new Book(123, "Five Survive", "Holly Jackson");
	book.addReview(new Review("Crazy Plots overloaded!", 5));
	book.addReview(new Review("Holly Jackson outdid herself!", 4.5));
	book.addReview(new Review("A must read.", 4));

	System.out.println(book);
}
}
