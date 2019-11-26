package coo.questionnaire;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * A class to read the user input in CLI mode.
 */
public class Input {

    private static  Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }
    
    public static final Input INPUT = new Input();

    /**
     * Create a new input class.
     */
    private Input() {
    }
    
    /**
     * Read a string from the command line.
     *
     * @return the string that was read
     * @throws IOException throws if some input/output problems was raised
     */
    public static String readString() throws IOException {
        return scanner.next();
    }

    /**
     * Read a string line from the command line.
     *
     * @return the line that was read
     * @throws IOException throws if some input/output problems was raised
     */
    public static String readLine() throws IOException {
        return scanner.nextLine();
    }

    /**
     * Read an int from the command line.
     *
     * @return the integer that was read
     * @throws IOException throws if some input/output problems was raised
     */
    public static int readInt() throws IOException {
        return scanner.nextInt();
    }
    
    
    public  void setIn(InputStream g) {
    	this.scanner= new Scanner(g);
    }
    
    public void setIntoStringIn() {
    	this.setIn(System.in);
    }
}
