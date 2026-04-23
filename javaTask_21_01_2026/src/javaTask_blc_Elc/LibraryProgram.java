package javaTask_BLC_ELC;


 class LibraryProgram {
    // Business Logic Class (BLC)
    static class Library {
        private int bookId;
        private String author;
        private String title;
        private double price;
        private int pages;

        public void setBookDetails(int bookId, String author, String title, double price, int pages) {
            this.bookId = bookId;
            this.author = author;
            this.title = title;
            this.price = price;
            this.pages = pages;
        }

        public void displayBookDetails() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Author: " + author);
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
            System.out.println("Pages: " + pages);
        }
    }

    // Executable Logic Class (ELC)
    public static class LibraryMain {
        public static void main(String[] args) {
            Library book = new Library();
            book.setBookDetails(101, "Chetan Bhagat", "Five Point Someone", 299.99, 250);
            book.displayBookDetails();
        }
    }
}
