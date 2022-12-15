import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[]{0, 100, 1, 2, 3};

        System.out.println(findMax(array1));
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for(int i: array) {
            if(i > max) {
                max = i;
            }
        }

        return max;
    }
}
