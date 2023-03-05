package seedu.duke.entries;

public class Income extends Entry {
    public Income (String description, String amount){
        super(description, amount, EntryEnum.INCOME);
    }

}
