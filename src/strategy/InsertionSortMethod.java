package strategy;

public class InsertionSortMethod implements IMethod {
    @Override
    public byte[] sort(byte[] array) {
        for (int i = 1; i < array.length; i++) {
            byte key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }

        return array;
    }
}
