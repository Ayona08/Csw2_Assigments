public class q6 {
    public static void main(String[] args) {
        try {
            String strNumber = "abc123";

            int number = Integer.parseInt(strNumber); 

            System.out.println("Number: " + number); 
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please provide a valid integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

