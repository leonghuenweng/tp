package seedu.duke.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import seedu.duke.exceptions.InvalidArgumentsException;
import seedu.duke.exceptions.InvalidCommandException;
import seedu.duke.exceptions.MissingArgumentsException;

public class Parser {

    final private static String COMMAND_ADD = "/add";
    final private static String COMMAND_VIEW = "/view";
    final private static String COMMAND_EDIT = "/edit";
    final private static String COMMAND_DELETE = "/delete";
    final private static String COMMAND_HELP = "/help";
    final private static String COMMAND_BYE = "/bye";
    final private static String COMMAND_CATEGORY_SHORT = "/c";
    final private static String COMMAND_CATEGORY_LONG = "/category";
    final private static String COMMAND_PRICE_SHORT = "/p";
    final private static String COMMAND_PRICE_LONG = "/price";
    final private static String MESSAGE_INVALID_COMMAND = "Please enter a valid command!";
    final private static String MESSAGE_INVALID_ARGUMENTS = "Please enter the valid argument(s)!";
    final private static String MESSAGE_MISSING_ARGUMENTS = "Please enter the required argument(s)!";

    public static void parseUserInput(String userInput)
            throws InvalidCommandException, InvalidArgumentsException, MissingArgumentsException {
        String[] userInputArray = userInput.trim().split(" ", 2);
        String command = userInputArray[0].toLowerCase();
        String arguments = userInput.replaceFirst(command, "").trim();
        switch (command) {
            case COMMAND_ADD:
                parseAddCommand(arguments);
                break;
            case COMMAND_VIEW:
                parseViewCommand(arguments);
                break;
            case COMMAND_EDIT:
                parseEditCommand(arguments);
                break;
            case COMMAND_DELETE:
                parseDeleteCommand(arguments);
                break;
            case COMMAND_HELP:
                parseHelpCommand();
                break;
            case COMMAND_BYE:
                parseByeCommand();
            default:
                throw new InvalidCommandException(MESSAGE_INVALID_COMMAND);
        }
    }

    private static void parseByeCommand() {
        // Print bye message
        ;
    }

    private static void parseHelpCommand() {
        // Print help message
        ;
    }

    private static void parseDeleteCommand(String arguments)
            throws InvalidArgumentsException, MissingArgumentsException {
        if (arguments.isEmpty()) {
            throw new MissingArgumentsException(MESSAGE_MISSING_ARGUMENTS);
        }
        String[] argumentsArray = arguments.split(" ", 2);
        try {
            Integer taskId = Integer.parseInt(argumentsArray[0]);
        } catch (NumberFormatException e) {
            throw new InvalidArgumentsException(MESSAGE_INVALID_ARGUMENTS);
        }

        // do something with taskId

    }

    private static void parseAddCommand(String arguments) throws MissingArgumentsException {
        if (arguments.isEmpty()) {
            throw new MissingArgumentsException(MESSAGE_MISSING_ARGUMENTS);
        }
        String description = "";
        String category = "";
        String price = "";
        String[] argumentsArray = parseArguments(arguments);

    }

    private static void parseEditCommand(String arguments) throws MissingArgumentsException {
        if (arguments.isEmpty()) {
            throw new MissingArgumentsException(MESSAGE_MISSING_ARGUMENTS);
        }
    }

    private static void parseViewCommand(String arguments) throws MissingArgumentsException {
        if (arguments.isEmpty()) {
            throw new MissingArgumentsException(MESSAGE_MISSING_ARGUMENTS);
        }
    }

    private static String[] parseArguments(String arguments) {
        String description = "";
        String category = "";
        String price = "";
        String[] argumentsArray = new String[3];
        Pattern descriptionPattern = Pattern.compile("(\\w+(\\s+\\w+)*)");
        Pattern categoryPattern = Pattern.compile("-c\\s+(\\w+(\\s+\\w+)*)");
        Pattern pricePattern = Pattern.compile("-p\\s+(\\S+)");

        Matcher matcher = descriptionPattern.matcher(arguments);
        if (matcher.find()) {
            description = matcher.group(1);
        }

        matcher = categoryPattern.matcher(arguments);
        if (matcher.find()) {
            category = matcher.group(1);
        }

        matcher = pricePattern.matcher(arguments);
        if (matcher.find()) {
            price = matcher.group(1);
        }

        argumentsArray[0] = description;
        argumentsArray[1] = category;
        argumentsArray[2] = price;

        return argumentsArray;
    }
}
