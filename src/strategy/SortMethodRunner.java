package strategy;

import java.util.Random;

public class SortMethodRunner {
    public static void main(String[] args) {
        Random random = new Random();

        byte[] array1 = new byte[5];
        byte[] array2 = new byte[3];
        byte[] array3 = new byte[14];

        random.nextBytes(array1);
        random.nextBytes(array2);
        random.nextBytes(array3);

        SortMethod sortMethod = new SortMethod();

        sortMethod.setMethod(new BubbleSortMethod());
        sortMethod.printResult(array1);
        sortMethod.printResult(array2);
        sortMethod.printResult(array3);

        sortMethod.setMethod(new SelectionSortMethod());
        sortMethod.printResult(array1);
        sortMethod.printResult(array2);
        sortMethod.printResult(array3);

        sortMethod.setMethod(new InsertionSortMethod());
        sortMethod.printResult(array1);
        sortMethod.printResult(array2);
        sortMethod.printResult(array3);
    }
}
