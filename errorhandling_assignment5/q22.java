// CustomCheckedException.java
public class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

// Main program using CustomCheckedException
public class CustomExceptionHandling {
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (CustomCheckedException e) {
            System.out.println("CustomCheckedException caught: " + e.getMessage());
        }
    }

    private static void performOperation() throws CustomCheckedException {
        // Simulating a specific error condition
        boolean errorCondition = true;

        if (errorCondition) {
            throw new CustomCheckedException("Error: Specific condition encountered.");
        } else {
            System.out.println("Operation successful.");
        }
    }
}
