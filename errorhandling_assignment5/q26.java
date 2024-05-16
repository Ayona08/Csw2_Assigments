public class q26 {
    public static void main(String[] args) {
        try {
            // Simulating ClassNotFoundException
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found.");
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            // Simulating MethodNotFoundException
            throw new NoSuchMethodException("Method not found.");
        } catch (NoSuchMethodException e) {
            System.out.println("Error: Method not found.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

