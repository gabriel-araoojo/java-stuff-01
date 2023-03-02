public class Post extends User {
    private String postContent;

    public Post(String newUsername, int newAge, String newPostContent) {
        super(newUsername, newAge);
        postContent = newPostContent;
    }
    public void formatPost() {
        System.out.println(
                "@" + getUsername() + ":\n" + postContent
        );
    }
}
