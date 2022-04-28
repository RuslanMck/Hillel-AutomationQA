/** This class contains the following methods with console output: <br>
 * printArray(int[] array); <br> */
public class consoleOutput {

    /** This method prints the array in the console*/
    public void printArray(int[] array){
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }
}
