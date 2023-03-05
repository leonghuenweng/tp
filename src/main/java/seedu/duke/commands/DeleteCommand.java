package seedu.duke.commands;

import seedu.duke.logs.EntryLog;

public class DeleteCommand {
    public static void deleteEntry(int entryId){
        EntryLog.delete(entryId - 1);
    }
}
