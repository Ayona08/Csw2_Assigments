import java.util.InputMismatchException;
import java.util.Scanner;

public class q25{
    public static void main(String[] args) {
        int number = readInteger();
        System.out.println("You entered: " + number);
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Input must be an integer.");
            return readInteger(); // Recursive call to handle invalid input
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
}

