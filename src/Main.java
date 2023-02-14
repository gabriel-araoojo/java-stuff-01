import java.util.*;

public class Main {
    public static void main(String[] args) {
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