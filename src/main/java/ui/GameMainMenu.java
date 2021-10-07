package ui;
import message.Message;
public class GameMainMenu {
    public void showWelcome() {
        showToUser(Message.MESSAGE_WELCOME,  Message.MESSAGE_GREET);

    }
    private void showToUser(String... message) {
        for (String m : message) {
            String formatted = m.replace("\n", System.lineSeparator());
            System.out.println(formatted);
        }
    }
}
