package ui;
import message.Message;

import java.io.InputStream;
import java.util.Scanner;

public class GameMainMenu {
    private static final String DIVIDER = "____________________________________________________________";
    private final Scanner in;

    public GameMainMenu() {
        this(System.in);
    }

    public GameMainMenu(InputStream in) {
        this.in = new Scanner(in);
    }
    public void showLine() {
        System.out.println(DIVIDER);

    }

    public void showWelcome() {
        showToUser(Messages.MESSAGE_WELCOME, DIVIDER, Messages.MESSAGE_GREET, DIVIDER);

    }
    public void showGoodbyeMessage() {
        showToUser(Messages.MESSAGE_GOODBYE);
    }

    private void showToUser(String... message) {
        for (String m : message) {
            String formatted = m.replace("\n", System.lineSeparator());
            System.out.println(formatted);
        }
    }

    public void showError(String errorInformation) {
        System.out.println(errorInformation);
    }

    /**
     * Deal with all kinds of error
     */

}