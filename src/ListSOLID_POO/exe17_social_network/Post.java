package ListSOLID_POO.exe17_social_network;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private User author;
    private String message;
    private List<Comment> comments;

    public Post(User author, String message) {
        this.author = author;
        this.message = message;
        this.comments = new ArrayList<>();
    }

    public String getMessage() {
        return message;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post by " + author.getName() + ": " + message;
    }
}
