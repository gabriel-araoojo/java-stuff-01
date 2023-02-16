import java.util.Scanner;

public class User {
    private String username;
    private int age;
    static final float PI = 3.14159f;

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

    public static void showGreater() {
        Scanner auxScanner = new Scanner(System.in);

        int firstInt = auxScanner.nextInt();
        int secondInt = auxScanner.nextInt();
        int greaterInt;

        if(firstInt >= secondInt) {
            greaterInt = firstInt;
        }

        else {
            greaterInt = secondInt;
        }

        System.out.println(greaterInt + " is the greater integer");
    }
}
