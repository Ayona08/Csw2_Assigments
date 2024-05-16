package stringmanipulation;

import java.util.Scanner;

public class q10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.println(areRotations(str1, str2) ? "The strings are rotations of each other." : "The strings are not rotations of each other.");

        scanner.close();
    }

    private static boolean areRotations(String str1, String str2) {
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }
}
