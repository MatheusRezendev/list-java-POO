package exe_book;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private boolean isAvailable;

    public Book(String title, String author, int numberOfPages, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isAvailable = isAvailable;
    }

    public void lendBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book: " + getTitle() + ":" + " Successfully borrowed");
        }else{
            System.out.println("Book: " + getTitle() + ":" + " Unavailable for loan");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println("Book: " + getTitle() + ":" + " Returned successfully");
        }else{
            System.out.println("Book: " + getTitle() + ":" + " is already available");
        }
    }

    public void verifyStatusBook(){
        System.out.println("Book: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Number of Pages: " + getNumberOfPages());
        String status = isAvailable ? "Available" : "Unavailable";
        System.out.println("Status: " + status);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
