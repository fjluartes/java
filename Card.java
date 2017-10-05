// Card: Card class for Blackjack2
public class Card {
    String card;
    int cardValue;

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(String card) {
        if (card.equals("J") || card.equals("Q") || card.equals("K")) {
            card = "10";
        } else if (card.equals("A")) {
            card = "11";
        }
        cardValue = Integer.parseInt(card);
    }
}
