package seedu.duke.entries;

public class Entry {
    private String description;
    private String amount;
    private EntryEnum entryCategory;

    public Entry (String description, String amount, EntryEnum entryCategory){
        this.description = description;
        this.amount = amount;
        this.entryCategory = entryCategory;
    }

}
