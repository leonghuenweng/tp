package seedu.duke;

import java.util.Scanner;

import seedu.duke.constants.MessageConstants;
import seedu.duke.parser.Parser;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        System.out.println(MessageConstants.MESSAGE_WELCOME);
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String userInput = in.nextLine();
            try {
                Parser.parseUserInput(userInput);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
