package seedu.duke.constants;

public final class MessageConstants {
    private MessageConstants() {
    }

    private static final String NEWLINE = System.lineSeparator();
    public static final String LOGO = " _____           _        _   _____      _" + NEWLINE
            + "|  __ \\         | |      | | |  __ \\    | |" + NEWLINE
            + "| |__) |__   ___| | _____| |_| |__) |_ _| |" + NEWLINE
            + "|  ___/ _ \\ / __| |/ / _ \\ __|  ___/ _` | |" + NEWLINE
            + "| |  | (_) | (__|   <  __/ |_| |  | (_| | |" + NEWLINE
            + "|_|   \\___/ \\___|_|\\_\\___|\\__|_|   \\__,_|_|";
    public static final String MESSAGE_WELCOME = "Welcome to" + NEWLINE
            + LOGO + NEWLINE + NEWLINE
            + "How may I help you?" + NEWLINE;
}
