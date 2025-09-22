public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;


    public Book(String title, String author, String isbn, int yearPublished) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setYearPublished(yearPublished);
        this.isAvailable = true; // Default to true (available)
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    // Setter methods with validation
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title.");
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author.");
        }
    }

    public void setIsbn(String isbn) {
        if (isbn != null && (isbn.length() == 10 || isbn.length() == 13)) {
            this.isbn = isbn;
        } else {
            System.out.println("Invalid ISBN. It must be 10 or 13 characters long.");
        }
    }

    public void setYearPublished(int year) {
        if (year >= 1450 && year <= 2025) {
            this.yearPublished = year;
        } else {
            System.out.println("Invalid year. It must be between 1450 and 2025.");
        }
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }


    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

