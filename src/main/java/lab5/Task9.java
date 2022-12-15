package lab5;

public class Task9 {
    public static void main(String[] args) {
        printResult(new int[][]{{1, 2, 3}, {0, 12, 4}, {0, 0, 0}});
        printResult(null);
        printResult(new int[][]{null, {0, 1, 2}});
        printResult(new int[][]{{Integer.MIN_VALUE, 1, 2}, {5, 1, 2}});
        printResult(new int[5][5]);
    }

    public static int[][] toArray(int[][] matrix) {
        checkIfMatrixIsNull(matrix);

        int arrayLength = numberOfNotZeroCells(matrix);
        int[][] array = new int[arrayLength][3];
        int lastCell = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    array[lastCell][0] = i;
                    array[lastCell][1] = j;
                    array[lastCell][2] = matrix[i][j];
                    lastCell++;
                }
            }
        }

        return array;
    }

    public static int numberOfNotZeroCells(int[][] matrix) {
        int counter = 0;

        for (int[] row : matrix) {
            for (int i : row) {
                if (i != 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void printResult(int[][] matrix) {
        try {
            printArray(matrix);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static void checkIfMatrixIsNull(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException("Matrix doesn't exist");
        }
        for (int[] row : matrix) {
            if (row == null) {
                throw new NullPointerException("The matrix has null elements!");
            }
        }
    }

    public static void printArray(int[][] matrix) {
        int[][] array = toArray(matrix);

        if (array.length != 0) {
            System.out.print("Array: ");

            for (int i = 0; i < array.length; i++) {
                System.out.print("[");

                for (int j = 0; j < array[i].length; j++) {
                    if (j != array[i].length - 1) {
                        System.out.print(array[i][j] + ", ");
                    } else {
                        System.out.print(array[i][j]);
                    }
                }
                if (i != array.length - 1) {
                    System.out.print("], ");
                } else {
                    System.out.println("]");
                }
            }
        } else {
            System.out.println("Array: []");
        }
    }
}
