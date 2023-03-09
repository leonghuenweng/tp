package seedu.duke.commands;

import seedu.duke.entrylog.EntryLog;

public class Command {
    protected EntryLog entryLog = new EntryLog();

    public void setData(EntryLog entryLog){
        this.entryLog = entryLog;
    }

    public void execute(){

    }
}
