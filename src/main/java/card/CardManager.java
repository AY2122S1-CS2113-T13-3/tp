package main.java.Card;
import java.util.ArrayList;
import java.util.List;

public class CardManager {
    private int cardCount = 0;
    private List<Card> cards;

    public CardManager(List<Card> cards) {
        this.cards = cards;
    }

    public CardManager() {
        this.cards = new ArrayList<>();
    }

    public void addCard(String message) {

    }

    public void searchCard(String message) {

    }

    public void deleteCard(int id) {

    }

    public void exchangeCard(int[] cardsToExchange) {

    }

    public void listCards() {

    }

    public void markAsUsed(int id) {

    }
}
