package seedu.pocketpal.data.entry;

import com.google.gson.Gson;
import seedu.pocketpal.communication.Serialisable;
import seedu.pocketpal.frontend.constants.EntryConstants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents an entry, from which various possible entry types
 * such as Food, Medical or Income are derived. User may specify
 * their desired entry type when adding to their entry log.
 * e.g., <code>/add lunch -p 15 -c food</code>
 */
public class Entry implements Serialisable {
    private Category category;
    private String description;
    private double amount;
    private String dateTime;

    public Entry(String description, double amount, Category category) {
        assert amount >= 0 : "Entry amount must be non-negative!";
        assert category != null : "Entry category cannot be null";
        assert !description.isEmpty() : "Entry description cannot be empty";
        this.description = description;
        this.amount = amount;
        this.category = category;
        LocalDateTime dateTime = LocalDateTime.now();
        this.dateTime = dateTime.format(DateTimeFormatter.ofPattern("d MMM uuuu, HH:mm:ss"));
    }

    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    public String getDateTime(){
        return dateTime;
    }

    public String getCategoryString() {
        switch (category) {
        case CLOTHING:
            return EntryConstants.CLOTHING;
        case ENTERTAINMENT:
            return EntryConstants.ENTERTAINMENT;
        case FOOD:
            return EntryConstants.FOOD;
        case MEDICAL:
            return EntryConstants.MEDICAL;
        case OTHERS:
            return EntryConstants.OTHERS;
        case PERSONAL:
            return EntryConstants.PERSONAL;
        case UTILITIES:
            return EntryConstants.UTILITIES;
        case TRANSPORTATION:
            return EntryConstants.TRANSPORTATION;
        case INCOME:
            return EntryConstants.INCOME;
        default:
            throw new IllegalArgumentException();
        }
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        assert amount >= 0 : "Entry amount must be non-negative!";
        this.amount = amount;
    }

    public void setCategory(Category category) {
        assert category != null : "Entry category cannot be null";
        this.category = category;
    }

    public void setDescription(String description) {
        assert !description.isEmpty() : "Entry description cannot be empty";
        this.description = description;
    }

    @Override
    public String serialise() {
        return new Gson().toJson(this);
    }
}
