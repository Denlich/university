public class Task1 {
    public static void main(String[] args) {
        printResult(new int[]{3, 5, 6});
        printResult(new int[]{1, 2, 3, 4});
        printResult(new int[]{});
        printResult(null);
    }

    public static int findMaxElementArray(int[] array) {
        int maxElement = array[0];

        for (int val: array) {
            if (val > maxElement) {
                maxElement = val;
            }
        }

        return maxElement;
    }

    static void printResult(int[] array) {
        try {
            System.out.println(findMaxElementArray(array));
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}