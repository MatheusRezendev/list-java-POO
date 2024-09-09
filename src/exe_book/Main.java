package exe_book;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Game of Thrones", "Jon Snow", 333, true);

        b.verifyStatusBook();

        b.lendBook();

        b.returnBook();
    }
}