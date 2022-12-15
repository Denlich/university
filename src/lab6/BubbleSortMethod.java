package lab6;

import java.util.Random;

public class BubbleSortMethod {
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
        printResult(new byte[]{1, 2, 3, 4});
        printResult(null);
    }

    static byte[] bubbleSortMethod(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    byte buffer = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buffer;
                }
            }
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
            printArray(bubbleSortMethod(array));
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    static void printArray(byte[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }

        System.out.println("]");
    }
}
