// Blackjack2Game: Game class for Blackjack2
public class Blackjack2Game {
    public void whoWins(int playerTotal, int dealerTotal) {
        System.out.println("");
        System.out.println("Player total is " + playerTotal);
        System.out.println("Dealer Total is " + dealerTotal);

        if (playerTotal > dealerTotal) {
            System.out.println("PLAYER WINS!");
        } else {
            System.out.println("DEALER WINS!");
        }
    }   
}
