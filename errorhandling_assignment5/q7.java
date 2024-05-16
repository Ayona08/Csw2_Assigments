import java.util.Scanner;

public class  q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String input = scanner.nextLine();

        try {
            int number = convertStringToInt(input);
            System.out.println("Successfully converted string to integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int convertStringToInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
}

