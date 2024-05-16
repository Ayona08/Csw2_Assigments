import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {
        int[] array = {1, 2 , 3, 7, 9,  4,5, 6, 8, 10};

        int smallestMissingNumber = SmallestMissingNumber(array);
        System.out.println("Smallest positive missing number: " + smallestMissingNumber);
    }
    public static int SmallestMissingNumber(int[] array) {
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : array) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= 10; i++) {
            if (!numCountMap.containsKey(i)) {
                return i;
            }
        }
        return 11;
    }
}