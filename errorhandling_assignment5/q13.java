import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();
            double result = evaluateFunction(x);
            System.out.println("Result of the function: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Invalid mathematical operation.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }

    private static double evaluateFunction(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);

        // Check for potential division by zero
        if (Math.abs(sinX + cosX) < 1e-10) {
            throw new ArithmeticException("Division by zero error.");
        }

        return (sinX * cosX) / (sinX + cosX);
    }
}

