public class q20 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        recursiveArrayTraversal(array, 0);
    }

    private static void recursiveArrayTraversal(int[] array, int index) {
        try {
            if (index >= array.length) {
                System.out.println("Reached end of array. Recursion terminated.");
                return;
            }
            System.out.println("Element at index " + index + ": " + array[index]);
            recursiveArrayTraversal(array, index + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Recursion terminated.");
        }
    }
}

