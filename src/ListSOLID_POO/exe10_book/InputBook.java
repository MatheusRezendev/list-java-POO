package ListSOLID_POO.exe10_book;

import java.util.Scanner;

public class InputBook {

    Scanner sc = new Scanner(System.in);

    public void inputBook(Book b) {
        System.out.println("Enter the name of the book: ");
        b.setTitle(sc.next());

        System.out.println("Enter the author of the book: ");
        b.setAuthor(sc.next());

        System.out.println("Enter the number of pages of the book: ");
        b.setNumberOfPages(sc.nextInt());
    }
}
