// BlackjackDealer: Dealer class for Blackjack2
public class BlackjackDealer {
    Hand h = new Hand();
    String dealerCard1, dealerCard2, decide;
    int total;
    boolean isBust = false;

    public void dealDealerHand() {
        h.setHand();
        dealerCard1 = h.card1;
        dealerCard2 = h.card2;
        System.out.println("Dealer has " + dealerCard1 + " and a hidden card");
    }

    public int getDealerTotal() {
        return total;
    }

    public void setDealerTotal() {
        total = h.getHandTotal();
    }

    public void dealerTurn() {
        System.out.println("Dealer's hidden card is " + dealerCard2);
        System.out.println("Dealer's total is " + getDealerTotal());
        
        while (isBust == false) {
            while (getDealerTotal() < 17) {
                h.setNewHandTotal();
                setDealerTotal();
                System.out.println("");
                System.out.println("Dealer hits");
                System.out.println("Dealer drew " + h.addCard);
                System.out.println("Dealer's total is " + getDealerTotal());
                isBust = dealerBust(getDealerTotal());
            }
            if (isBust) {
                break;
            } else if (getDealerTotal() >= 17 && getDealerTotal() <= 21) {
                System.out.println("Dealer stays");
                break;
            }
        }
    }

    public boolean dealerBust(int dealerTotal) {
        if (dealerTotal > 21) {
            System.out.println("Dealer busts! PLAYER WINS!");
            return true;
        } else {
            return false;
        }
    }
}
