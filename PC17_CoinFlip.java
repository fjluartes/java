// PC17 (Project): Coin Flip
import java.util.Scanner;

public class PC17_CoinFlip {
    static int totalAmount = 10000;

    public static void coinFlipGame(String str, String withBets) {
        Scanner l = new Scanner(System.in);
        String s = str.toLowerCase();
        String b = withBets.toLowerCase();
        int bet = 0, cash = 0;
        boolean playerWin = false;
        String[] coin = new String[2];
        coin[0] = "heads";
        coin[1] = "tails";
        int num = (int) (Math.random() * 2);
        if (b.equals("y")) {
            System.out.println("Your money is " + totalAmount);
            System.out.println("How much do you want to bet?");
            bet = l.nextInt();
        } else if (b.equals("n")) {
            bet = 0;
        }
        if (s.equals(coin[num])) {
            System.out.println("You guessed correct! YOU WIN!");
            playerWin = true;
        } else if (!s.equals("heads") && !s.equals("tails")) {
            System.out.println("Error!");
        } else {
            System.out.println("You guessed wrong! YOU LOSE!");
        }
        System.out.println("Your total money is " + bets(bet, playerWin));
    }

    public static int bets(int betAmount, boolean playerWin) {
        if (playerWin) {
            totalAmount = totalAmount + betAmount;
        } else {
            totalAmount = totalAmount - betAmount; 
        }
        if (totalAmount <= 0) {
            totalAmount = 0;
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String guess, playAgain = "y", withBets = "n";
        System.out.println("COIN FLIP GAME!!!");
        while (playAgain.equals("y")) {
            System.out.println("Heads or Tails?");
            guess = k.nextLine();
            System.out.println("Do you want to have bets or not? (Y/N)");
            withBets = k.nextLine();
            coinFlipGame(guess, withBets);
            System.out.println("Do you want to play again? (Y/N)");
            playAgain = k.nextLine();
        }
    }
}
