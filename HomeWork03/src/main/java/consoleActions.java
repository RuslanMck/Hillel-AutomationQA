import java.util.Scanner;
/** This class contains the following methods with console: <br>
 * consoleInput(); <br> */
public class consoleActions {

    /** This method reads the integer values from the console <br>
     * Returns int*/
    public int consoleInput() {
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        return input;
    }
}
