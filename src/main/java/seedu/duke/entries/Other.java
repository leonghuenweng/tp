package seedu.duke.entries;

public class Other extends Entry {
    public Other(String description, String amount){
        super(description, amount, EntryEnum.OTHERS);
    }
}
