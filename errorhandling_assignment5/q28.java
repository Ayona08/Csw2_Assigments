public class q28 {
    private static int recursionDepth = 0;

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Error: Stack overflow occurred.");
            System.out.println("Recursion depth reached: " + recursionDepth);
        }
    }

    private static void recursiveMethod() {
        recursionDepth++;
        recursiveMethod();
    }
}

