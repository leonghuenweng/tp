package seedu.duke;

import java.util.Scanner;

import seedu.duke.exceptions.InvalidCommandException;
import seedu.duke.parser.Parser;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        String logo = " _____           _        _   _____      _\n" +
                "|  __ \\         | |      | | |  __ \\    | |\n" +
                "| |__) |__   ___| | _____| |_| |__) |_ _| |\n" +
                "|  ___/ _ \\ / __| |/ / _ \\ __|  ___/ _` | |\n" +
                "| |  | (_) | (__|   <  __/ |_| |  | (_| | |\n" +
                "|_|   \\___/ \\___|_|\\_\\___|\\__|_|   \\__,_|_|\n\n";

        System.out.println("Welcome to\n" + logo + "How may I help you?\n");
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
