package seedu.duke;

import java.util.Scanner;

import seedu.duke.exceptions.InvalidCommandException;
import seedu.duke.parser.Parser;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
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
