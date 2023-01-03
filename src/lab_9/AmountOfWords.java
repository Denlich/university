package lab_9;

public class AmountOfWords {
    public static void main(String[] args) {
        printResult("The user with the nickname koala757677 this month left 3 times more comments " +
                "than the user with the nickname croco181dile181920 4 months ago");
        printResult(null);
        printResult("21349138");
        printResult(" ");
        printResult("Check the sentence on amount of words");
        printResult("123nj word notWord1, 92183492438");
        printResult("Hello World !");
        printResult("! ,");
    }

    public static void printResult(String sentence) {
        try {
            System.out.println(amountOfWords(sentence));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Here we are calculating amount of words in sentnce
     * */
    public static int amountOfWords(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0;

        for (String word : words) {
            if (isTheWord(word)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Here we are checking if the word from the sentence has only letters, whether not - we are returning false
     * */
    public static boolean isTheWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
