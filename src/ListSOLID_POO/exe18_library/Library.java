package ListSOLID_POO.exe18_library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private Map<Book, String> loanedBooks;

    public Library() {
        this.books = new ArrayList<>();
        this.loanedBooks = new HashMap<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Book: " + title + " by " + author + " added to the library.");
    }

    public void loanBook(String title, String user) {
        Book book = findBook(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            loanedBooks.put(book, user);
            System.out.println("Book: " + title + " loaned to " + user);
        } else if (book != null) {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    public void returnBook(String title) {
        Book book = findBook(title);
        if (book != null && loanedBooks.containsKey(book)) {
            book.setAvailable(true);
            loanedBooks.remove(book);
            System.out.println("Book '" + title + "' returned successfully.");
        } else {
            System.out.println("Book not found in the loaned list.");
        }
    }

    public void checkAvailability(String title) {
        Book book = findBook(title);
        if (book != null) {
            System.out.println("Book '" + title + "' is " + (book.isAvailable() ? "available" : "unavailable") + ".");
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
