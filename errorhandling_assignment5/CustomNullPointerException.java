public class CustomNullPointerException extends RuntimeException {

    public CustomNullPointerException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        String input = null;

        try {
            if (input == null || input.isEmpty()) {
                throw new CustomNullPointerException("Input string is null or empty.");
            }

            // Some logic that may cause NullPointerException
            int length = input.length();
            System.out.println("Length of input string: " + length);

        } catch (CustomNullPointerException e) {
            System.out.println("CustomNullPointerException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
