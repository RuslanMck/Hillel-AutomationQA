/** This class contains the following methods with arrays: <br>
 * arrayFromConsole(); <br>
 * positiveNumbersArrayInit(int[] array); <br>
 * negativeNumbersArrayInit(int[] array); <br> */
public class arrays {

    private static consoleOutput consoleOutput = new consoleOutput();
    private static consoleActions consoleActions = new consoleActions();

    /** This method allows to create an array from the int characters entered from the console. <br>
     * Returns int[]*/
    public static int[] arrayFromConsole() {

        int[] inputArray;
        System.out.println("Enter the desired array size (integer characters): ");
        inputArray = new int[consoleActions.consoleInput()];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Enter the value (integer characters): ");
            inputArray[i] = consoleActions.consoleInput();
        }
        System.out.println("New array includes: ");
        consoleOutput.printArray(inputArray);
        return inputArray;
    }

    /** This method run throw the entered array, and create new array with positive numbers from the entered array. <br>
     * Print the content fo the new array in the console.*/
    public static void positiveNumbersArrayInit(int[] array) {
        int[] resultArray;
        int resultArraySize = 0;
        int resultArrayCounter = 0;

        for (int i : array) {
            if (i > 0) {
                resultArraySize++;
            }
        }
        resultArray = new int[resultArraySize];


        for (int i : array) {
            if (i > 0) {
                resultArray[resultArrayCounter] = i;
                resultArrayCounter++;
            }
        }
        System.out.println("Array of the positive numbers entered from the console: ");
        consoleOutput.printArray(resultArray);
    }

    /** This method run throw the entered array, and create new array with negative numbers from the entered array. <br>
     * Print the content fo the new array in the console.*/
    public static void negativeNumbersArrayInit(int[] array) {
        int[] resultArray;
        int resultArraySize = 0;
        int resultArrayCounter = 0;

        for (int i : array) {
            if (i < 0) {
                resultArraySize++;
            }
        }
        resultArray = new int[resultArraySize];


        for (int i : array) {
            if (i < 0) {
                resultArray[resultArrayCounter] = i;
                resultArrayCounter++;
            }
        }
        System.out.println("Array of the negative numbers entered from the console: ");
        consoleOutput.printArray(resultArray);
    }
}
