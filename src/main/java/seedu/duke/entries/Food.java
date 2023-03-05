package seedu.duke.entries;

public class Food extends Entry {
    public Food (String description, String amount){
        super(description, amount, EntryEnum.FOOD);
    }
}
