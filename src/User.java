import java.util.Scanner;

public class User extends AbstractUser {
    private String username = "user_x";
    private int age = 33;
    public static final float PI = 3.14159f;

    public User(String newUsername, int newAge) {
        username = newUsername;
        age = newAge;
    }

    public String getUsername() {
        return this.username;
    }

    //age is read only
    public int getAge() {
        return this.age;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }
}
