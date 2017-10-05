// Blackjack2: Simple Blackjack game using OOP
public class Blackjack2 {
    public static void main(String[] args) {
        BlackjackPlayer player1 = new BlackjackPlayer();
        BlackjackDealer dealer = new BlackjackDealer();
        Blackjack2Game game = new Blackjack2Game();
        GameHelper helper = new GameHelper();
        String decide;

        System.out.println("FRED'S NEW BLACKJACK GAME!!!");
        player1.dealPlayerHand();
        dealer.dealDealerHand();
        player1.setPlayerTotal();
        System.out.println("");

        System.out.println("Player total is " + player1.getPlayerTotal());
        decide = helper.getUserInput("Would Player like to \"hit\" or \"stay\"");
        player1.decision(decide);

        if (player1.isBust == false) {
            dealer.setDealerTotal();
            dealer.dealerTurn();
        }
        
        if (player1.isBust == false && dealer.isBust == false) {
            game.whoWins(player1.getPlayerTotal(), dealer.getDealerTotal());
        }
    }
}
