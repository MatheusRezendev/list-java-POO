package ListSOLID_POO.exe17_social_network;

public class Comment {
    private User author;
    private String message;

    public Comment(User author, String message) {
        this.author = author;
        this.message = message;
    }

    @Override
    public String toString() {
        return author.getName() + " commented: " + message;
    }
}
