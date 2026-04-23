package javaTask_BLC_ELC;

public class LibraryProgram {

	// Business Logic Class (BLC) inside the same file
	static class Library {
		private int bookId;
		private String author;
		private String title;
		private double price;
		private int pages;

		// Method to set book details
		public void setBookDetails(int bookId, String author, String title, double price, int pages) {
			this.bookId = bookId;
			this.author = author;
			this.title = title;
			this.price = price;
			this.pages = pages;
		}

		// Method to display book details
		public void displayBookDetails() {
			System.out.println("Book ID: " + bookId);
			System.out.println("Author: " + author);
			System.out.println("Title: " + title);
			System.out.println("Price: " + price);
			System.out.println("Pages: " + pages);
		}
	}

	// Executable Logic Class (ELC) in the same file
	public static void main(String[] args) {
		// Create object of Library class
		Library book = new Library();

		// Set book details
		book.setBookDetails(101, "Chetan Bhagat", "Five Point Someone", 299.99, 250);

		// Display book details
		book.displayBookDetails();
	}
}
