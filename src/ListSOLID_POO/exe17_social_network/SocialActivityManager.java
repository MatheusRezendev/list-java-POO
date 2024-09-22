package ListSOLID_POO.exe17_social_network;

public class SocialActivityManager {
    private UserManager userManager;

    public SocialActivityManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void addFriend(String userName, String friendName) {
        User user = userManager.findUser(userName);
        User friend = userManager.findUser(friendName);

        if (user != null && friend != null) {
            user.addFriend(friend);
        } else {
            System.out.println("User or friend not found!");
        }
    }

    public void postMessage(String userName, String message) {
        User user = userManager.findUser(userName);
        if (user != null) {
            user.publishPost(message);
        } else {
            System.out.println("User not found!");
        }
    }

    public void commentOnPost(String userName, Post post, String comment) {
        User user = userManager.findUser(userName);
        if (user != null) {
            user.commentOnPost(post, comment);
        } else {
            System.out.println("User not found!");
        }
    }

    public void displayUserPosts(String userName) {
        User user = userManager.findUser(userName);
        if (user != null) {
            user.getPosts().forEach(post -> {
                System.out.println(post);
                post.getComments().forEach(System.out::println);
            });
        } else {
            System.out.println("User not found!");
        }
    }
}
