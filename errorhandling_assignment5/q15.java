import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number as a string: ");
            String input = scanner.nextLine();

            // Outer try-catch block for handling NumberFormatException
            try {
                int number = Integer.parseInt(input);
                System.out.println("Parsed number: " + number);

                // Inner try-catch block for handling ArithmeticException
                try {
                    int result = 10 / number;
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
}

