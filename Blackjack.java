// Fred Luartes, 10/2/2016 (rev 6/28/2017)
// Blackjack: Write a program that allows a human user to play a simplified version of Blackjack against a computer opponent. Include high score.
import java.util.Scanner;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();		
        int playerCard1, playerCard2, dealerCard1, dealerCard2, cardHit, playerTotal, dealerTotal;
        String choice = "", choiceLower = "";
        boolean isNotBust = true;

        playerCard1 = 2 + r.nextInt(10);
        playerCard2 = 2 + r.nextInt(10);
        dealerCard1 = 2 + r.nextInt(10);
        dealerCard2 = 2 + r.nextInt(10);
        playerTotal = playerCard1 + playerCard2;
        dealerTotal = dealerCard1 + dealerCard2;
        System.out.println("FRED'S BLACKJACK GAME!");
        System.out.println("\nYou drew " + playerCard1 + " and " + playerCard2 + ".");
        System.out.println("The total is " + playerTotal + ".");
        System.out.println("\nThe dealer has " + dealerCard1 + " and a hidden card.");
        System.out.println("The total is hidden.");
        System.out.println("\nWould you like to \"hit\" or \"stay\"? ");
        choice = keyboard.nextLine();
        choiceLower = choice.toLowerCase();
        while (choiceLower.equals("hit") && isNotBust) {
            cardHit = 1 + r.nextInt(10);
            playerTotal += cardHit;
            System.out.println("\nYou drew " + cardHit + ".");
            System.out.println("The total is " + playerTotal + ".");
            if (playerTotal > 21) {
                System.out.println("\nBust! DEALER WINS!");
                isNotBust = false;
                break;
            }
            System.out.println("\nWould you like to \"hit\" or \"stay\"? ");
            choice = keyboard.nextLine();
            choiceLower = choice.toLowerCase();
        } 
        while (isNotBust) {
            System.out.println("\nDealer's turn.");
            System.out.println("The dealer hidden card is " + dealerCard2 + ".");
            System.out.println("The total is " + dealerTotal +".");
            while (dealerTotal <= 16) {
                cardHit = 1 + r.nextInt(10);
                dealerTotal += cardHit;
                System.out.println("\nDealer hits.");
                System.out.println("Dealer drew " + cardHit + ".");
                System.out.println("The total is " + dealerTotal + ".");
            } 
            if (dealerTotal >= 17 && dealerTotal <= 21) {
                System.out.println("\nDealer stays.");
                break;
            } else if (dealerTotal > 21) {
                System.out.println("\nDealer busts! YOU WIN!");	
                break;
            } 
        }
        if (playerTotal <= 21 && dealerTotal <= 21) {
            System.out.println("\nYour total is " + playerTotal);
            System.out.println("Dealer total is " + dealerTotal);
            if (playerTotal > dealerTotal) {
                System.out.println("\nYOU WIN!");
            } else {
                System.out.println("\nDEALER WINS!");
            }
        }
    }
}
