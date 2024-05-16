import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();

            double result = calculateExpressionValue(x);
            System.out.println("Result of the expression: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
    private static double calculateExpressionValue(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double tanX = Math.tan(x);
        // Check for division by zero in tan(x) + 1
        if (Math.abs(tanX + 1) < 1e-10) {
            System.out.println("Error: tan(x) + 1 results in division by zero.");
            return Double.NaN; // Return NaN as an indicator of error
        }
        // Check for negative values inside the square root function
        if (sinX * cosX < 0) {
            System.out.println("Error: sqrt argument is negative.");
            return Double.NaN; // Return NaN as an indicator of error
        }

        return Math.sqrt(Math.abs(sinX * cosX)) / (tanX + 1);
    }
}

