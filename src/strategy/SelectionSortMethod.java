package strategy;

public class SelectionSortMethod implements IMethod {
    @Override
    public byte[] sort(byte[] array) {
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
}
