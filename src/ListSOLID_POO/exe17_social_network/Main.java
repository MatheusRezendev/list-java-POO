package ListSOLID_POO.exe17_social_network;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        SocialActivityManager activityManager = new SocialActivityManager(userManager);

        userManager.registerUser("Matheus");
        userManager.registerUser("Joao");

        activityManager.addFriend("Matheus", "Joao");

        activityManager.postMessage("Matheus", "Hello");
        activityManager.postMessage("Joao", "Hello!");

        User matheus = userManager.findUser("Matheus");
        Post matheusPost = matheus.getPosts().get(0);
        activityManager.commentOnPost("Joao", matheusPost, "Nice!");

        activityManager.displayUserPosts("Matheus");
    }
}