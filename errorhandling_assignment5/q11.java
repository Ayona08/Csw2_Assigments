import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();

            double result = computeFunctionValue(x);
            System.out.println("Result of the function: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
    private static double computeFunctionValue(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double tanX = Math.tan(x);
        double cotX = 1.0 / Math.tan(x); // cot(x) = 1 / tan(x)
        // Check for potential division by zero in tan(x) - cot(x)
        if (Math.abs(tanX - cotX) < 1e-10) {
            System.out.println("Error: tan(x) - cot(x) results in division by zero.");
            return Double.NaN; // Return NaN as an indicator of error
        }
        // Check for negative values in log argument
        if (sinX + cosX <= 0) {
            System.out.println("Error: log argument is not positive.");
            return Double.NaN; // Return NaN as an indicator of error
        }
        return Math.log(sinX + cosX) / (tanX - cotX);
    }
}
