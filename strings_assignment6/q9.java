package stringmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray())
            if (Character.isLetter(ch))
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

        char mostFrequentChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }

        System.out.println(maxCount > 0 ? "Most frequent character: " + mostFrequentChar + "\nFrequency: " + maxCount : "No letters found in the input string.");
        scanner.close();
    }
}

