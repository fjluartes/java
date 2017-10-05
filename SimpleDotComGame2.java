// SimpleDotComGame2: Simpler DotCom game (similar to Battleship)
import java.util.Scanner;

public class SimpleDotComGame2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        SimpleDotCom dot = new SimpleDotCom();
        int numOfGuesses = 0;
        int[] locations = new int[3];
        int rand = (int) (Math.random() * 5);
        String userGuess;
        String result = "";

        for (int i = 0; i < 3; i++) {
            locations[i] = rand;
            rand++;
        }
        dot.setLocationCells(locations);
        
        while (result != "kill") {
            System.out.println("Enter a number ");
            userGuess = keyboard.next();
            result = dot.checkYourself(userGuess);
            numOfGuesses++;
        }
        System.out.println("You took " + numOfGuesses + " guesses");
    }
}
