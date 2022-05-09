public class DivisionError {

    boolean zeroCheck(long[] array) {
        boolean result = false;
        for (double i : array) {
            if (i == 0) {
                result = false;
                System.out.println("ERROR: division by zero");
                break;
            } else result = true;
        }
        return result;
    }

    boolean zeroCheck(double[] array) {
        boolean result = false;
        for (double i : array) {
            if (i == 0) {
                result = false;
                System.out.println("ERROR: division by zero");
                break;
            } else result = true;
        }
        return result;
    }
}
