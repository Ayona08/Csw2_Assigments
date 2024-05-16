import java.util.Scanner;
public class q10{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of x in radians: ");
            double x = scanner.nextDouble();
            double result = calculateExpression(x);
            System.out.println("Result of the expression: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    private static double calculateExpression(double x) {
        double epsilon = 1e-6; // Small value to check if x is close to multiples of pi/2
        double piDiv2 = Math.PI / 2.0;

        if (Math.abs(x - piDiv2) < epsilon || Math.abs(x + piDiv2) < epsilon) {
            System.out.println("Error: x is close to multiples of pi/2. Division by zero avoided.");
            return Double.NaN;
        }
        return (Math.sin(x) + Math.cos(x)) / Math.tan(x);
    }
}

