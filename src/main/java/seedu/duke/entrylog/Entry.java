package seedu.duke.entrylog;

import seedu.duke.constants.EntryConstants;

public class Entry {
    private Category category;
    private String description;
    private double price;

    public Entry(String description, double price, Category category) {
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
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
        default:
            throw new IllegalArgumentException();
        }
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
