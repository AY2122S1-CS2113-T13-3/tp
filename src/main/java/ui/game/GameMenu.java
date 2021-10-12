package ui.game;

import data.Player;
import ui.Menu;
import ui.main.GameMainCommandType;
import ui.main.GameMainMenu;
import utils.Errors;
import utils.IO;
import utils.StringParser;
import utils.message.Strings;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The game menu after start the CodeHunt game.
 */
public class GameMenu extends Menu {
    /**
     * The {@code Scanner} for the menu to consume input.
     */
    private final Scanner in;

    /**
     * The parser with the rest of the command to be consumed by the menu.
     */
    private final StringParser parser;

    /**
     * Creates a new instance of the game menu.
     */
    public GameMenu(Scanner in, StringParser parser) {
        this.in = in;
        this.parser = parser;
    }

    @Override
    public void enter() {
        welcome();
        try {
            if (!parser.hasMoreTokens()) {
                System.out.println(Strings.SUBCOMMAND_HELP_MESSAGE);
                help();
                return;
            }
            GameCommandType commandType = GameCommandType.getCommandType(parser.nextToken());
            if (commandType == null) {
                Errors.print(parser.getString(), Strings.ERR_UNKNOWN_COMMAND);
                return;
            }
            if (parser.hasMoreTokens()) {
                Errors.print(parser.getRemaining(), Strings.ERR_UNEXPECTED_INPUT);
                return;
            }
            switch (commandType) {
                case START: {
                    System.out.println(Strings.CHOOSE_LEVEL_MESSAGE);
                    int selection = in.nextInt();

                    if (selection == 1) {
                        // EasyMenu easyMenu = new EasyMenu(in, parser);
                        // easyMenu.enter();
                    } else if(selection == 2) {
                        // DifficultMenu easyMenu = new DifficultMenu(in, parser);
                        // easyMenu.enter();
                    } else {
                        Errors.print(Integer.toString(selection), Strings.ERR_INVALID_NUMBER);
                    }

                    break;
                }
                case CHECK: {
                    if (parser.hasMoreTokens()) {
                        Errors.print(parser.getRemaining(), Strings.ERR_UNEXPECTED_INPUT);
                    }

                    showRecord();
                    break;
                }
                case CARD: {
                    /* CardMenu cardMenu = new CardMenu(in, parser);
                       cardMenu.enter(); */
                    break;
                }
                case BACK: {
                    if (parser.hasMoreTokens()) {
                        Errors.print(parser.getRemaining(), Strings.ERR_UNEXPECTED_INPUT);
                    }
                    GameMainMenu gameMainMenu = new GameMainMenu(in);
                    gameMainMenu.enter();
                    break;
                }
                case EXIT: {
                    if (parser.hasMoreTokens()) {
                        Errors.print(parser.getRemaining(), Strings.ERR_UNEXPECTED_INPUT);
                    }
                    exit(true);
                    return;
                }
                default: {
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            exit(false);
        }
    }

    /**
     * Displays the welcome message.
     */
    private void welcome() {
        System.out.println(Strings.GAME_WELCOME_MESSAGE);
        help();
        System.out.println();
    }

    /**
     * Displays the game history of this player.
     */
    private void showRecord() {
        System.out.println(Strings.GAME_RECORD_MESSAGE);
        Player.showGameProgress();
    }

    /**
     * Displays available commands and their corresponding details.
     */
    private void help() {
        for (GameMainCommandType commandType : GameMainCommandType.values()) {
            System.out.printf("%-12s%s\n", commandType.getCommand(), commandType.getInfo());
        }
        System.out.println();
    }

    /**
     * The handler for command "exit". Does all necessary cleanups before the exit.
     * Note that the exit does not happen here. It is done by the {@code return}
     * statement under the {@link #enter()} method.
     *
     * @param promptToSave whether to prompt to save the current state or not
     */
    public void exit(boolean promptToSave) {
        // TODO: Implement "prompt to save" functionality
        System.out.println(Strings.MAIN_EXIT_MESSAGE);
        System.out.println();
    }

}
