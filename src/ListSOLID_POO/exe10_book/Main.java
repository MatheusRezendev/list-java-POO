package ListSOLID_POO.exe10_book;

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        InputBook i = new InputBook();
        BookController bc = new BookController();

        i.inputBook(b);

        bc.verifyStatusBook(b);

        bc.lendBook(b);

        bc.returnBook(b);
    }
}