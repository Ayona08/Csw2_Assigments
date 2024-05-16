public class q2 {
    public static void main(String[] args) {
        String input = "abc123def456ghi";
     try {
            if (input == null || input.isEmpty()) {
                throw new NullPointerException("Input string is null or empty.");
            }

            boolean foundNumeric = false;
            char[] chars = input.toCharArray();

            for (int i = 2; i < chars.length; i++) {
                if (Character.isDigit(chars[i]) &&
                        Character.isLetter(chars[i - 1]) &&
                        Character.isLetter(chars[i - 2]) &&
                        isVowel(chars[i - 2])) {
                    System.out.println("Numeric character: " + chars[i]);
                    foundNumeric = true;
                }
            }

            if (!foundNumeric) {
                System.out.println("No numeric characters found after a vowel and consonant.");
            }

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
