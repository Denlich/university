public class Task1 {
    public static void main(String[] args) {
        printResults(10, 10);
        printResults(15, 1);
        printResults(7, -5);
        printResults(10, Double.MAX_VALUE);
        printResults(10, Double.NaN);
    }

    public static double func(double k, double z) {
        double ans = 0;
        double cal = 0;

        if (k >= 15) {
            throw new IllegalArgumentException("param k = " + k);
        }
        for (int i = 1; i < k; i++) {
            ans = cal + ans;
            cal = 1 / Math.sqrt(z * i) + Math.tan(k / i);
        }
        return ans;
    }

    static void printResults(double k, double z) {
        System.out.print("k:" + k + " z:" + z + " result:");
        try {
            System.out.println(func(k, z));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}