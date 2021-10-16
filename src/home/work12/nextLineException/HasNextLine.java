package home.work12.nextLineException;

import java.util.Scanner;

public class HasNextLine {

    // own exception: check for not-empty input. Input is scanned from console in loop

    public static void main(String[] args) {
        String inputString = null;

        HasNextLine line = new HasNextLine();

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Type something: ");
            String str = line.isHasNextLine(inputString);
        }
    }

    private String isHasNextLine(String inputString) {
        try {
            Scanner str = new Scanner(System.in);
            inputString = str.nextLine();
            if (inputString.equals("")) {
                throw new NoNextLineException("Invalid! Empty input");
            } else {
                System.out.println(inputString);
            }
        } catch (NoNextLineException e) {
            System.out.println("Invalid! Empty input");
        }
        return null;
    }
}

