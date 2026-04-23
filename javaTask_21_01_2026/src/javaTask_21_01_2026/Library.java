package javaTask_21_01_2026;
/*
 * ASSIGNMENT 

TOPIC            : BLC AND ELC

TASK : 
  Create a Java program to manage book details with the following specifications:
BLC (Business Logic Class):
●      Create a class named Library with the following attributes:
○      bookId (int)
○      author (String)
○      title (String
   ○      price (double)

○      pages (int)

●      Implement a method setBookDetails() to set values for all attributes.
●      Implement a method displayBookDetails() to print all the book details.

ELC (Executable Logic Class):
●      Create a separate class named LibraryMain that contains the main() method.
●      In the main() method:
○      Create an object of the Library class.
○      Use the setBookDetails() method to assign values to the object.
○      Call the displayBookDetails() method to display the book details.

Note : Create two different files
 * */
public class Library {
	// Business Logic Class (BLC)

	// Attributes
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
