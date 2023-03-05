package seedu.duke.logs;

import seedu.duke.entries.Entry;
import java.util.ArrayList;

public class EntryLog {
    public static ArrayList<Entry> entryList = new ArrayList<>();

    public EntryLog() {
        this.entryList = new ArrayList<>();
    }

    public static void add(Entry entryObj) {
        entryList.add(entryObj);
    }

    public static void delete(int entryId){
        entryList.remove(entryId);
    }

}
