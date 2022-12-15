package lab5;

public class Task3 {
    public static void main(String[] args) {
        printResult(new int[][]{{1, 2, 3},{0, 10, 4},{-34, 21, 5}});
        printResult(new int[][]{{1}});
        printResult(new int[][]{{1}, {2}, {3}, {4}});
        printResult(new int[][]{{1}, {2, 3, 4}});
        printResult(null);
        printResult(new int[][]{null, {1, 2, 3}});
    }

    public static void swapColumns(int[][] matrix) {
        int maxColumn = findMaxColumn(matrix);
        int minColumn = findMinColumn(matrix);

        for (int i = 0; i < matrix.length; i++) {
            int buffer = matrix[i][maxColumn];
            matrix[i][maxColumn] = matrix[i][minColumn];
            matrix[i][minColumn] = buffer;
        }
    }

    public static int findMaxColumn(int[][] matrix) {
        int max = matrix[0][0];
        int maxColumn = 0;

        for (int[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                if (i[j] > max) {
                    max = i[j];
                    maxColumn = j;
                }
            }
        }

        return maxColumn;
    }

    public static int findMinColumn(int[][] matrix) {
        int min = matrix[0][0];
        int minColumn = 0;

        for (int[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                if (i[j] < min) {
                    min = i[j];
                    minColumn = j;
                }
            }
        }

        return minColumn;
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

    public static void printResult(int[][] matrix) {
        try {
            checkIfMatrixIsNull(matrix);

            System.out.println("Matrix: ");
            printMatrix(matrix);
            swapColumns(matrix);

            System.out.println("Result:");
            printMatrix(matrix);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
