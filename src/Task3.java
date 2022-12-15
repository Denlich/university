import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        printResult(new int[]{-10, -5, 0, 5, 0, 0, 10, 15});
        printResult(new int[]{0, -123, 12, 0, 13,-7, 0});
        printResult(null);
        printResult(new int[]{});
    }

    public static int[] newArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i=0; i < array.length; i++ ) {
            if (array[i] < 0) {
                newArray[i] = array[i] + findMaxElementArray(array);
            } else if (array[i] == 0) {
                newArray[i] = 1;
            } else {
                newArray[i] = array[i] * 2;
            }
        }

        return newArray;
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
            System.out.println(Arrays.toString(newArray(array)));
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
