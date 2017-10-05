// Hand: Hand class for Blackjack2
public class Hand {
    Card c = new Card();
    String[] cards = new String[]{"A", "2", "3", "4", "5", 
                "6", "7", "8", "9", "10", "J", "Q", "K"};
    String card, card1, card2, addCard;
    int cardsTotal;

    public String getCard() {
        return card;
    }

    public void setCard() {
        int i = (int) (Math.random() * 13);
        card = cards[i];
    }

    public int getHandTotal() {
        return cardsTotal;
    }

    public void setHand() {
        int val1, val2;
        setCard();
        card1 = getCard();
        setCard();
        card2 = getCard();

        c.setCardValue(card1);
        val1 = c.getCardValue();
        c.setCardValue(card2);
        val2 = c.getCardValue();

        if (val1 == 11 && val2 == 11) {
            val1 = 1;
        }
        cardsTotal = val1 + val2;
    }

    public void setNewHandTotal() {
        int val;
        setCard();
        addCard = getCard();
        c.setCardValue(addCard);
        val = c.getCardValue();
        cardsTotal += val;
    }
}
