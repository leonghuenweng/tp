package seedu.duke;

import java.util.Scanner;

import seedu.duke.commands.Command;
import seedu.duke.constants.UIConstants;
// import seedu.duke.entries.Entry;
import seedu.duke.entrylog.EntryLog;
import seedu.duke.parser.Parser;
import seedu.duke.ui.UI;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        UI ui = new UI();
        ui.printWelcome();
        EntryLog entrylog = new EntryLog();
        Scanner in = new Scanner(System.in);
        Command command = new Command();
        do {
            ui.printAwaitUserInput();
            String userInput = in.nextLine();
            ui.printLine();
            try {
                command = Parser.parseUserInput(userInput);
                command.execute(entrylog);
            } catch (Exception e) {
                ui.print(e.getMessage() + UIConstants.NEWLINE);
                ui.printLine();
            }
        } while (!command.isExit);
    }
}
