package ListSOLID_POO.exe18_library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("Game of thrones", "George r r martin");
        library.addBook("Diario de um banana", "Banana");

        library.displayBooks();

        library.loanBook("Game of Thrones", "Matheus");

        library.checkAvailability("Game of thrones");
        library.checkAvailability("Diario de um banana");

        library.returnBook("Game of thrones");

        library.checkAvailability("Game of thrones");

        library.displayBooks();
    }
}