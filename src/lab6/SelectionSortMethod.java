package lab6;

import java.util.Random;

import static lab6.BubbleSortMethod.printArray;

public class SelectionSortMethod {
    public static void main(String[] args) {
        Random random = new Random();

        byte[] a = new byte[4];
        random.nextBytes(a);

        byte[] b = new byte[10];
        random.nextBytes(b);

        byte[] c = new byte[0];
        random.nextBytes(c);

        printResult(a);
        printResult(b);
        printResult(c);
        printResult(null);
    }

    static byte[] selectionSortMethod(byte[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxNum = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxNum]) {
                    maxNum = j;
                }
            }

            byte buffer = array[maxNum];
            array[maxNum] = array[i];
            array[i] = buffer;
        }

        return array;
    }

    static void checkIfArrayIsNull(byte[] array) {
        if (array == null) {
            throw new NullPointerException("Array doesn't exist");
        }
    }

    static void printResult(byte[] array) {
        try {
            checkIfArrayIsNull(array);

            System.out.print("Array: ");
            printArray(array);

            System.out.print("Array sorted: ");
            printArray(selectionSortMethod(array));
        } catch (Exception e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
