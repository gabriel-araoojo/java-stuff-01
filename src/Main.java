import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner tempScanner = new Scanner(System.in);
        String username;

        try {
            username = tempScanner.nextLine();
            throw new ArithmeticException();
        }
        catch (Exception e) {
            System.out.println(e);
            username = tempScanner.nextLine();
        }
        finally {
            System.out.println("everything's fine");
        }

        User newUser = new User("bo", 23);

        newUser.setUsername(username);

        System.out.println(newUser.getUsername());
        System.out.println(newUser.getAge());

        Post newPost = new Post(newUser.getUsername(), newUser.getAge(), "oba oba oba");

        newPost.formatPost();
    }
}