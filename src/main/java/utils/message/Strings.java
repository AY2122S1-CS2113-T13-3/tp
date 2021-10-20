package utils.message;

/**
 * String constants used in the program.
 */
public class Strings {
    private Strings() {
        // Disallow instantiation
    }

    // Application name and version
    public static final String APP_NAME_LONG = "A text-based code game for children ages 6 and up(Code Hunt)";
    public static final String APP_NAME_SHORT = "Code Hunt";
    public static final String APP_VERSION = "1.0";

    // Prompt
    public static final String MAIN_PROMPT = String.format("%s > ", APP_NAME_SHORT);
    public static final String HELP_MESSAGE = "Type \"help\" to see a list of available commands.";
    public static final String SUBCOMMAND_HELP_MESSAGE = "Please provide a subcommand.";

    // Main menu messages
    private static final String LOGO = "  ____          _        _   _             _  \n"
            + " / ___|___   __| | ___  | | | |_   _ _ __ | |_ \n"
            + "| |   / _ \\ / _` |/ _ \\ | |_| | | | | '_ \\| __|\n"
            + "| |__| (_) | (_| |  __/ |  _  | |_| | | | | |_\n"
            + " \\____\\___/ \\__,_|\\___| |_| |_|\\__,_|_| |_|\\__|\n";
    public static final String MAIN_WELCOME_MESSAGE = LOGO
            + String.format("Welcome to %s.Are you ready to play?\n", APP_NAME_LONG) + HELP_MESSAGE;
    public static final String MAIN_ABOUT_MESSAGE = String.format("%s (Version %s)\n", APP_NAME_LONG, APP_VERSION)
            + "Developed by Wang Chuhan, Jiang Yuxin, Xue Yushan, Wang Ruisi, Peng Wenxuan";
    public static final String MAIN_EXIT_MESSAGE =
            String.format("Thank you playing %s ! Have a nice day~~", APP_NAME_SHORT);
    public static final String MAIN_PLAYER_ID_ENTER_PROMPT = "Enter your player ID: ";

    // Game menu messages
    public static final String GAME_WELCOME_MESSAGE = LOGO
            + "There you go!";
    public static final String CHOOSE_LEVEL_MESSAGE = "Please choose your game mode: \n"
            + "(1) Easy Mode | (2) Difficult Mode.";
    public static final String GAME_RECORD_MESSAGE = "Here is your Game History.";

    // Easy game messages
    private static final String DIVIDER = "=========================================================";
    public static final String EASY_LOGO = "            _.------.                        .----.__\n"
            + "           /         \\_.       ._           /---.__  \\\n"
            + "          |  O    O   |\\\\___  //|          /       `\\ |\n"
            + "          |  .vvvvv.  | )   `(/ |         | o     o  \\|\n"
            + "          /  |     |  |/      \\ |  /|   ./| .vvvvv.  |\\\n"
            + "         /   `^^^^^'  / _   _  `|_ ||  / /| |     |  | \\\n"
            + "       ./  /|         | O)  O   ) \\|| //' | `^vvvv'  |/\\\\\n"
            + "      /   / |         \\        /  | | ~   \\          |  \\\\\n"
            + "      \\  /  |        / \\ Y   /'   | \\     |          |   ~\n"
            + "       `'   |  _     |  `._/' |   |  \\     7        /\n"
            + "         _.-'-' `-'-'|  |`-._/   /    \\ _ /    .    |\n"
            + "    __.-'            \\  \\   .   / \\_.  \\ -|_/\\/ `--.|_\n"
            + " --'                  \\  \\ |   /    |  |              `-\n"
            + "                       \\uU \\UU/     |  /   :F_P:\n";
    public static final String EASY_GAME_WELCOME_MESSAGE = DIVIDER + "\nHello! Brave cool kids!\n"
            + "We are the Avengers. To protect the world from devastation, we need your help!\n"
            + "We need to get as many cards ad possible for the last Infinity Gem.\n"
            + "Win following games and collect the cards.\n"
            + "Good luck!\n"
            + "We will be waiting for you and the cards!\n" + DIVIDER;
    public static final String HANG_MAN_START = "\n******************** Level 1: Hang Man ********************\n";
    public static final String QUIZ_START = "\n******************** Level 2: How Code Works ********************\n";
    public static final String GUESS_NUM_START = "\n******************** Level 3: Guess Number ********************\n";
    public static final String TREASURE_HUNT_START = "\n******************** "
            + "Level 4: Treasure Hunt ********************\n";
    public static final String FINISH_EASY_MODE = "Well done! You have finished all the task!!";

    // Card menu messages
    private static final String PACKAGE = "\n"
            + "      ___           ___           ___          _____    \n"
            + "     /  /\\         /  /\\         /  /\\        /  /::\\   \n"
            + "    /  /:/        /  /::\\       /  /::\\      /  /:/\\:\\  \n"
            + "   /  /:/        /  /:/\\:\\     /  /:/\\:\\    /  /:/  \\:\\ \n"
            + "  /  /:/  ___   /  /:/~/::\\   /  /:/~/:/   /__/:/ \\__\\:|\n"
            + " /__/:/  /  /\\ /__/:/ /:/\\:\\ /__/:/ /:/___ \\  \\:\\ /  /:/\n"
            + " \\  \\:\\ /  /:/ \\  \\:\\/:/__\\/ \\  \\:\\/:::::/  \\  \\:\\  /:/ \n"
            + "  \\  \\:\\  /:/   \\  \\::/       \\  \\::/~~~~    \\  \\:\\/:/  \n"
            + "   \\  \\:\\/:/     \\  \\:\\        \\  \\:\\         \\  \\::/   \n"
            + "    \\  \\::/       \\  \\:\\        \\  \\:\\         \\__\\/    \n"
            + "     \\__\\/         \\__\\/         \\__\\/                  \n";

    public static final String CARD_WELCOME_MESSAGE = PACKAGE
            + "Here is your package of cards!\n" + HELP_MESSAGE;
    public static final String LIST_CARD_MESSAGE = "Here is all of your cards!";
    public static final String CARD_DIVIDER_MESSAGE = "\n♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧\n";
    //Player messages
    public static final String PLAYER_NAME_ENTER_PROMPT = "Enter your player name: ";
    public static final String PLAYER_ID_PROMPT = "Remember your ID to continue your game next time: %s\n";

    // Error messages
    public static final String ERR_PLAYER_FILE_NOTFOUND_MESSAGE =
            " not found or does not exists. Default settings will be loaded.";
    public static final String ERR_PLAYER_FILE_CORRUPTED_MESSAGE =
            "Data file %s is corrupted. Default settings will be loaded instead.";
    public static final String ERR_UNKNOWN_COMMAND = "Unknown command.\n" + HELP_MESSAGE;
    public static final String ERR_UNEXPECTED_INPUT = "Unexpected input.\n" + HELP_MESSAGE;
    public static final String ERR_EMPTY_STRING = "Please provide an input.";
    public static final String ERR_UNKNOWN_INPUT = "Please enter one of the options provided.";
    public static final String ERR_INPUT_MISMATCH_INT_EXPECTED = "Please enter an integer.";
    public static final String ERR_INPUT_MISMATCH_DOUBLE_EXPECTED = "Please enter a number.";
    public static final String ERR_BOOLEAN_INPUT = "Please enter \"y\" for yes, \"n\" for no.";
    public static final String ERR_DATE_INPUT = "Please enter a valid date.";
    public static final String ERR_TIME_INPUT = "Please enter a valid time.";
    public static final String ERR_INVALID_NUMBER = "Please enter a number from either 1 or 2.";

}
