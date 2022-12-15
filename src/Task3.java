public class Task3 {
    public static void main(String[] args) {
        printResults(1);
        printResults(2);
        printResults(-3);
        printResults(4);
        printResults(Double.MIN_VALUE);
        printResults(Double.NaN);
    }

    public static double unlim(double epsilon) {
        int i = 1;
        double sum = 0;

        if (epsilon <= 0) {
            throw new IllegalArgumentException("param e = " + epsilon);
        }
        while (Math.abs(i) <= epsilon) {
            sum = sum + Math.pow(-1, i)/factorial(i);
            i++;
        }

        return sum;
    }

    public static int factorial(int param) {
        int result = 1;

        for (int j = 1; j <= param; j++) {
            result = result * j;
        }

        return result;
    }

    static void printResults(double epsilon) {
        System.out.print("Accuracy еpsilon:" + epsilon + " Result:");
        try {
            System.out.println(unlim(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
