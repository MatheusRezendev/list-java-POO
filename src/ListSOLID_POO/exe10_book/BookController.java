package ListSOLID_POO.exe10_book;

public class BookController {

    Book b = new Book();
    private boolean isAvailable = b.isAvailable();

    public void lendBook(Book b){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book: " + b.getTitle() + ":" + " Successfully borrowed");
        }else{
            System.out.println("Book: " + b.getTitle() + ":" + " Unavailable for loan");
        }
    }

    public void returnBook(Book b){
        if(!isAvailable){
            isAvailable = true;
            System.out.println("Book: " + b.getTitle() + ":" + " Returned successfully");
        }else{
            System.out.println("Book: " + b.getTitle() + ":" + " is already available");
        }
    }

    public void verifyStatusBook(Book b){
        System.out.println("Book: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Number of Pages: " + b.getNumberOfPages());
        String status = isAvailable ? "Available" : "Unavailable";
        System.out.println("Status: " + status);
    }
}
