package stringmanipulation;

class PalindromeChecker {
    public static void main(String[] args) {
        String input = "level";
        boolean isPalindrome = input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome);
    }
}

