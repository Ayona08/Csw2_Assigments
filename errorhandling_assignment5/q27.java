public class q27{
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            Integer number = (Integer) obj; // Attempting to cast a String to Integer
        } catch (ClassCastException e) {
            System.out.println("Error: ClassCastException occurred.");
        }
    }
}

