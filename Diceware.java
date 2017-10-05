// Fred Luartes, 9/18/2016
// Diceware: Dice roll simulation for Diceware passphrase generator. Visit http://world.std.com/~reinhold/diceware.html for Diceware passphrase list. 

import java.util.Random;

public class Diceware {
	public static void main(String[] args) {
		Random r = new Random();
		int dice1, dice2, dice3, dice4, dice5, dice6;
		
		dice1 = 1 + r.nextInt(6);
		dice2 = 1 + r.nextInt(6);
		dice3 = 1 + r.nextInt(6);
		dice4 = 1 + r.nextInt(6);
		dice5 = 1 + r.nextInt(6);
		
		System.out.println("ROLL ME THE MONEY!\n");
		System.out.println("Roll: " + dice1 + dice2 + dice3 + dice4 + dice5);
	}
}