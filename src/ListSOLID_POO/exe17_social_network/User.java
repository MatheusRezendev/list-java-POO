package ListSOLID_POO.exe17_social_network;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> friends;
    private List<Post> posts;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addFriend(User friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.getFriends().add(this);
            System.out.println(name + " is now friends with " + friend.getName());
        } else {
            System.out.println(friend.getName() + " is already your friend!");
        }
    }

    public void publishPost(String message) {
        Post post = new Post(this, message);
        posts.add(post);
        System.out.println(name + " posted: " + message);
    }

    public void commentOnPost(Post post, String comment) {
        post.addComment(new Comment(this, comment));
        System.out.println(name + " commented: " + comment);
    }
}
