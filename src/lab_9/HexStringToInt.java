package lab_9;

public class HexStringToInt {
    public static void main(String[] args) {
        printResult("CAFE");
        printResult("cafe");
        printResult(null);
        printResult("0");
        printResult("G");
        printResult("FFF");
    }

    public static void printResult(String hexString) {
        try {
            System.out.println(hexStringToInt(hexString));
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
    * Here we are converting hexadecimal string to int
    */
    public static int hexStringToInt(String hexString) {
        int result = 0;
        int radix = 16;

        for (int i = hexString.length() - 1; i >= 0; i--) {
            String hexadecimal = hexString.substring(i, i + 1).toUpperCase();
            int pow = hexString.length() - 1 - i;

            result += convertToDecimal(hexadecimal) * (Math.pow(radix, pow));
        }

        return result;
    }

    /**
     * Here we are getting decimal for hexadecimal character and returning it to hexToString method
     */
    public static int convertToDecimal(String hexadecimal) {
        return switch (hexadecimal) {
            case "A" -> 10;
            case "B" -> 11;
            case "C" -> 12;
            case "D" -> 13;
            case "E" -> 14;
            case "F" -> 15;
            default -> Integer.parseInt(hexadecimal);
        };
    }
}
