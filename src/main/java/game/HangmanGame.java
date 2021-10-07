package game;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame extends Game {
    // Coding Terminologies
    public static final String WORDS[] = {"algorithm", "argument", "arrays", "arithmetic operators",
            "assignment operators", "c", "loops", "java", "linux", "python", "statement", "variable",
            "while"};
    public static final Random RANDOM = new Random();
    public static final int MAX_TRIES = 5;
    public static final String LOGO = "\n" +
            "        .-------------------------------------------------------------------------------.\n" +
            "        |      _      _                                                                  |\n" +
            "        |     | |    | |   __ _    _ __      __ _        /\\/\\      __ _    _ __          |\n" +
            "        |     | |----| |  / _  |  |  _ \\    / _` |      /    \\    / _  |  |  _  \\        |\n" +
            "        |     | |----| | | (_| |  | | | |  | (_| |     / /\\/\\ |  | (_| |  | | | |        |\n" +
            "        |     |_|    |_|  \\_ _ |  |_| |_|   \\__, |     \\/    \\/   \\_ _ |  |_| |_|        |\n" +
            "        |                                    |___/                                       |\n" +
            "        .--------------------------------------------------------------------------------.\n";
    public static final String GAME_RULES = "The purpose of this game is to guess an coding terminology, secretly chosen by the application\n\n" +
            "You have to guess one letter at a time and you can have " + MAX_TRIES + " wrong attempts\n\n" +
            "Enter a lower-case letter and don't forget to enter key after each guess\n\n" +
            "Let's play the game!\n\n";
    Scanner in = new Scanner(System.in);
    private String secretWord;
    private int length;
    private char[] guessWord;
    private int remainingTries;

    public HangmanGame() {
        this.secretWord = chooseSecretWord();
        this.length = secretWord.length();
        this.remainingTries = MAX_TRIES;
        this.guessWord = new char[length];
    }

    @Override
    public void execute() {
        boolean isPlay = true;
        displayGameDetails();

        while(isPlay) {
            HangmanGame hangmanGame = new HangmanGame();
            hangmanGame.play();
            isPlay = startNewGame();
        }
    }

    public void displayGameDetails() {
        System.out.println(LOGO);
        System.out.println(GAME_RULES);
    }

    public void play() {
        replaceDashes();
        System.out.println("Your guess word is:");
        displayWord();

        while(this.remainingTries > 0) {
            System.out.println("\nEnter your guess letter:");
            char guessLetter = in.next().charAt(0);

            int guess = isGuessTrue(guessLetter);

            if (guess == 0) {
                remainingTries--;
                System.out.println("\nWhoops! that letter is not present in the word");
                displayMan(remainingTries);
            }
            if (guess == 1) {
                System.out.println("\nYay! You have found the letter");
            }
            if (guess == 2) {
                System.out.println("\nYou have already guessed this letter. Try something else!" );
            }

            System.out.println("You can have " + this.remainingTries + " more wrong attempts");
            System.out.println("Your guess word is:");
            displayWord();

            if(secretWord.equals(new String(guessWord))) {
                System.out.println("\nCongratulation! You won.");
                return;
            }
        }
        if(!secretWord.equals(new String(guessWord))) {
            System.out.println("\nToo many Guesses! You have been hanged." );
            System.out.println("\nThe secret word was: " + this.secretWord);
        }

    }

    // choose next word randomly
    public String chooseSecretWord() {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }

    public void replaceDashes() {
        for(int i=0; i<this.length ; i++) {
            this.guessWord[i] = '-';
        }
    }

    public void displayWord() {
        for(int i=0; i<this.length ; i++) {
            System.out.print(this.guessWord[i]);
        }
        System.lineSeparator();
    }

    public int isGuessTrue(char letter) {
        int flag = 0;
        for(int i=0; i<this.length; i++) {
            if(this.secretWord.charAt(i) == letter) {
                if(this.guessWord[i] == this.secretWord.charAt(i)) {
                    flag = 2;
                } else {
                    this.guessWord[i] = this.secretWord.charAt(i);
                    flag = 1;
                }
            }
        }
        return flag;
    }

    public void displayMan(int remainingGuess) {
        String[] bodyPart = {"", "", "", ""};

        switch(remainingGuess) {
            case 0:
                bodyPart[3] = " |";
            case 1:
                bodyPart[2] = "/|\\";
            case 2:
                bodyPart[1] = "/|\\";
            case 3:
                bodyPart[0] = "( )";
                break;
        }

        String hangMan = "--------------"
                + "\n  |       " + bodyPart[3]
                + "\n  |       " + bodyPart[3]
                + "\n  |       " + bodyPart[0]
                + "\n  |       " + bodyPart[1]
                + "\n  |       " + bodyPart[2]
                + "\n  |\n"
                + "\n  |\n"
                + "--------------\n";

        System.out.println(hangMan);
    }

    public boolean startNewGame(){
        System.out.println("\nWould you like to play again? [y/n]");
        char again = in.next().charAt(0);
        return again == 'y';
    }

}

