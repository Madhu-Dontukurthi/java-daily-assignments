package javaTask_21_01_2026;

public class LibraryMain {
	// Executable Logic Class (ELC)
	public static void main(String[] args) {
		// Create object of Library class
		Library book = new Library();

		// Set book details
		book.setBookDetails(101, "Chetan Bhagat", "Five Point Someone", 299.99, 250);

		// Display book details
		book.displayBookDetails();
	}

}
