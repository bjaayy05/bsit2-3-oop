import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("B0   01", "Java Programming", "James Gosling", "978-1234567890", 350, "Computer Science");

        Magazine mag1 = new Magazine("M001", "Tech Today", "Editor Smith", 1, "October", true);

        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");


        Student student = new Student("S001", "Mary Jane", "mary@example.com", "S12345", "Computer Science");
        Faculty faculty = new Faculty("F001", "Dr. John Smith", "john@example.com", "Engineering", "Professor");

        LibraryManager libraryManager = new LibraryManager();
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(mag1);
        libraryManager.addItem(mag2);
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvd2);

        // Display all items
        System.out.println("All Library Items:");
        libraryManager.displayAllItems();

        System.out.println("\nStudent borrows a Book:");
        libraryManager.borrowItem("B001", student.getName());

        System.out.println("\nFaculty borrows a DVD:");
        libraryManager.borrowItem("D002", faculty.getName());

        System.out.println("\nStudent Borrowed Items:");
        student.displayBorrowedItems();

        System.out.println("\nFaculty Borrowed Items:");
        faculty.displayBorrowedItems();

        System.out.println("\nAvailable Items:");
        libraryManager.displayAvailableItems();

        System.out.println("\nStudent returns a Book:");
        libraryManager.returnItem("B001");

        System.out.println("\nFaculty returns a DVD:");
        libraryManager.returnItem("D002");

        System.out.println("\nAvailable Items after returns:");
        libraryManager.displayAvailableItems();

        System.out.println("\nCalculating Late Fees (for 3 days late):");
        double totalLateFees = libraryManager.calculateTotalLateFees(3);
        System.out.println("Total Late Fees: $" + totalLateFees);

        System.out.println("\nBorrowing Status of Items:");
        for (Borrowable item : libraryManager.getItems()) {
            System.out.println(item.getItemInfo() + " - " + item.getBorrowingStatus());
        }
    }
}
