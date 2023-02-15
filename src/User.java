import java.util.Scanner;

public class User {
    String username = "";
    static final float PI = 3.14159f;

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
