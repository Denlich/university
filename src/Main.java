public class Main {
    static double Task7(double a, double b,  double c, double d) {
        return Math.pow(4 * Math.cosh(Math.sqrt(Math.abs(a/b))) + 3 * Math.acos(d) ,c);
    }

    static double Task8(double a, double b, double c, double d) {
       return 5*a/Math.sin(a) + Math.sqrt(Math.tanh(Math.abs(b)) * c / Math.log10(d));
    }

    static double Task9(double a, double b, double c, double d) {
        return (Math.sin(Math.abs(a)) + Math.cos(Math.sqrt(b))) / (2 * Math.tan(c) + Math.pow(Math.E, d));
    }

    public static void main(String[] args) {
        System.out.println("Task 7 y = " + Task7(-3.45, 2.34, 1.45, 0.83));
        System.out.println("Task 8 y = " + Task8(0.345, -2.25, 2.65, 3.99));
        System.out.println("Task 9 y = " + Task9(-2.98, 5.55, 0.045, 0.129));
    }
}