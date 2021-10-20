package game;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

import logger.MyLogger;
import ui.main.GameMainMenu;

/**
 * The main of the programme.
 */
public class Game {
    /**
     * Set the logger.
     */
    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        try {
            MyLogger.setup();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
        }
        logger.log(Level.INFO, "going to start processing");
        Scanner in = new Scanner(System.in);
        GameMainMenu mainMenu = new GameMainMenu(in);
        mainMenu.enter();
        logger.log(Level.INFO, "end of processing");
        in.close();
    }
}
