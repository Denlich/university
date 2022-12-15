public class Task2 {
    public static void main(String[] args) {
        printResult(new int[]{1, 2, 3, 4});
        printResult(new int[]{120, 6, 0});
        printResult(new int[]{10, 128, 0});
        printResult(new int[]{});
        printResult(new int[]{1});
        printResult(null);
        printResult(new int[]{5, -15, 0, -23});
    }

    public static int sumOfSecondAndBiggest(int[] array) {
//        if (array.length < 2) {
//            throw new IllegalArgumentException();
//        }

        return array[1] + findMaxElementArray(array);
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
            System.out.println(sumOfSecondAndBiggest(array));
        } catch(IllegalArgumentException | IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
