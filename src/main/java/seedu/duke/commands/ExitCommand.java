package seedu.duke.commands;

import seedu.duke.constants.MessageConstants;
import seedu.duke.entrylog.EntryLog;

public class ExitCommand extends Command {
    public ExitCommand() {
        this.isExit = true;
    }

    @Override
    public void execute(EntryLog entries) {
        ui.print(MessageConstants.MESSAGE_EXIT);
    }
}
