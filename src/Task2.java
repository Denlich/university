public class Task2 {
    public static void main(String[] args) {
        printResults(1, 5);
        printResults(2, 10);
        printResults(3, 3);
        printResults(4, 6);
        printResults(Double.NaN, 10);
    }

    public static double x(double t, int n) {
        double ans1 = 0;
        double cal1 = 0;
        double ans2 = 0;
        double cal2 = 0;
        double ans = 0;


        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                cal2 = 1/Math.sqrt(t) * i;
                ans2 = cal2 + ans2;
            } else {
                cal1 = 1/t * i;
                ans1 = cal1 + ans1;
            }
        }
        ans = ans1+ans2;

        return ans;
    }

    static void printResults(double t, int n) {
        System.out.print("t:" + t + " n:" + n + " result:");
        System.out.println(x(t, n));
    }
}
