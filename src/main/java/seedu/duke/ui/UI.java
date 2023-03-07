package seedu.duke.ui;

import seedu.duke.constants.MessageConstants;
import seedu.duke.constants.UIConstants;

import java.text.DecimalFormat;

public class UI {
    /**
     * Converts double into string, adds decimal places if required.
     *
     * @param priceDouble price
     * @return String of price with two decimal places
     */
    private String formatPrice(double priceDouble) {
        return new DecimalFormat(UIConstants.FORMAT_2DP)
                .format(priceDouble);
    }

    /**
     * Converts expenditure into readable format.
     *
     * @param description Description of expenditure
     * @param price       Price of expenditure
     * @param category    Category of expenditure
     * @return Formatted expenditure string
     */
    private String formatExpenditure(String description, double price, String category) {
        return MessageConstants.DESCRIPTION +
                description +
                MessageConstants.NEWLINE +
                MessageConstants.PRICE +
                formatPrice(price) +
                MessageConstants.NEWLINE +
                MessageConstants.CATEGORY +
                category +
                MessageConstants.NEWLINE;
    }

    /**
     * formats the details of an entry object into a string
     * @param description of entry from Entry log
     * @param price of entry from Entry log
     * @param category of entry from Entry log
     * @param ID of entry from Entry log
     * @return string to be displayed upon calling /view command
     */
    public String formatViewEntries(String description, double price, String category, int ID){
        return "<"+Integer.toString(ID)+">: "+description+" ("+category+") - $"+formatPrice(price);
    }

    public void print(String output) {
        System.out.print(output);
    }

    public void printLine() {
        print(UIConstants.LINE);
    }

    public void printAwaitUserInput() {
        print(UIConstants.USER_INPUT_PROMPT);
    }

    public void printExit() {
        print(MessageConstants.MESSAGE_EXIT);
        printLine();
    }

    // TODO: Add expenditure edited
    public void printExpenditureAdded(String description, double priceDouble, String category) {
        print(MessageConstants.MESSAGE_EXPENDITURE_ADDED
                      + formatExpenditure(description, priceDouble, category));
        printLine();
    }

    public void printExpenditureDeleted(String description, double priceDouble, String category) {
        print(MessageConstants.MESSAGE_EXPENDITURE_DELETED
                      + formatExpenditure(description, priceDouble, category));
        printLine();
    }

    public void printHelp() {
        print(MessageConstants.MESSAGE_HELP);
        printLine();
    }

    public void printWelcome() {
        print(MessageConstants.MESSAGE_WELCOME);
        printLine();
    }
}
