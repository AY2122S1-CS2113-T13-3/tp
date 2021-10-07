package storage;

import game.Game;
import game.GameRecord;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Storage {
    private static File save;
    private static String path;

    public Storage(String filePath){
        path = filePath;
    }

    public static GameRecord load() {
        try {
            File record = new File("data");
            if (!record.exists()) {
                record.mkdir();
            }

            save = new File (path);
            if (!save.exists()) {
                save.createNewFile();
            }

            GameRecord games = new GameRecord();
            Scanner s = new Scanner(save);

            while (s.hasNext()) {
                String reading = s.nextLine();
                if (reading.equals("Hang man")) {
                    games.add(new HangMan());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return games;
    }

    public void writeToFile(GameRecord games) throws IOException {
        try {
            FileWriter fw = new FileWriter(save);
            for (Game game : games) {
                if (game.getName().equals("Hang man"));
                fw.write("Hang man\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}