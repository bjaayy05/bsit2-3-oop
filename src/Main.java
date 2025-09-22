public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);


        Library library = new Library();


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        System.out.println("Displaying all books in the library:");
        library.displayAllBooks();


        System.out.println("\nAttempting to borrow '1984':");
        boolean borrowSuccess = library.borrowBook("1234567890123");
        System.out.println("Borrowing '1984': " + (borrowSuccess ? "Success" : "Failed"));


        System.out.println("\nAttempting to borrow '1984' again:");
        borrowSuccess = library.borrowBook("1234567890123");
        System.out.println("Borrowing '1984': " + (borrowSuccess ? "Success" : "Failed"));


        System.out.println("\nAttempting to return '1984':");
        boolean returnSuccess = library.returnBook("1234567890123");
        System.out.println("Returning '1984': " + (returnSuccess ? "Success" : "Failed"));


        System.out.println("\nDisplaying available books:");
        library.displayAvailableBooks();


        System.out.println("\nCreating a book with invalid data (empty title):");
        Book invalidBook = new Book("", "Invalid Author", "12345", 2025);
        System.out.println("\nAttempting to add invalid book to library:");
        library.addBook(invalidBook);
    }
}
