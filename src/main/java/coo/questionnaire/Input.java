package coo.questionnaire;

import java.io.IOException;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public Input() {
    }

    public static String readString() throws IOException {
        return scanner.next();
    }

    public static String readLine() throws IOException {
        return scanner.nextLine();
    }

    public static int readInt() throws IOException {
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        try {
            System.out.print(" chaine : ? ");
            String chaineLue = readString();
            System.out.println("lue  => " + chaineLue);
            System.out.print(" int : ? ");
            int intLu = readInt();
            System.out.println("lue  => " + intLu);
        } catch (IOException var3) {
        }

    }

}
