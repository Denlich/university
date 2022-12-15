package strategy;

import java.util.Arrays;

public class SortMethod {
    private IMethod iMethod;

    public void setMethod(IMethod iMethod) {
        this.iMethod = iMethod;
    }

    public byte[] executeMethod(byte[] array) {
        return iMethod.sort(array);
    }

    public void printResult(byte[] array) {
        try {
            System.out.println(Arrays.toString(executeMethod(array)));
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
