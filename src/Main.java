import java.util.*;


public class Main {
    public static void main(String[] args) {
        User newUser = new User("baa", 23);

        newUser.setUsername("bo");

        System.out.println(newUser.getUsername());
        System.out.println(newUser.getAge());

        Post newPost = new Post(newUser.getUsername(), newUser.getAge(), "oba oba oba");

        newPost.formatPost();
    }
}