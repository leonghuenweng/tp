package seedu.duke.entries;

import seedu.duke.entries.Entry;

public class Income extends Entry {
    public Income (String description, String amount){
        super(description, amount, EntryEnum.INCOME);
    }

}
