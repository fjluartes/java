// BlackjackPlayer: Player class for Blackjack2
public class BlackjackPlayer {
    Hand h = new Hand();
    GameHelper helper = new GameHelper();
    String playerCard1, playerCard2, newCard, decide, decideLower;
    int total;
    boolean isBust = false;

    public void dealPlayerHand() {
        h.setHand();
        playerCard1 = h.card1;
        playerCard2 = h.card2;
        System.out.println("Player has " + playerCard1 + " and " + playerCard2);
    }

    public int getPlayerTotal() {
        return total;
    }

    public void setPlayerTotal() {
        total = h.getHandTotal();
    }

    public void decision(String decide) {
        decideLower = decide.toLowerCase();
        System.out.println("");
        while (decideLower.equals("hit")) {
            h.setNewHandTotal();
            setPlayerTotal();
            System.out.println("Player drew " + h.addCard);
            System.out.println("Player total is " + getPlayerTotal());
            isBust = playerBust(getPlayerTotal());
            if (isBust) {
                break;
            }

            decide = helper.getUserInput("Would Player like to \"hit\" or \"stay\"");
            decideLower = decide.toLowerCase();
        }
    }

    public boolean playerBust(int playerTotal) {
        if (playerTotal > 21) {
            System.out.println("Player busts! DEALER WINS!");
            return true;
        } else {
            return false;
        }
    }
}
