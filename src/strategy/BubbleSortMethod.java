package strategy;

public class BubbleSortMethod implements IMethod {
    @Override
    public byte[] sort(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    byte buffer = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buffer;
                }
            }
        }

        return array;
    }
}
