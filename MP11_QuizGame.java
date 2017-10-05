// Fred Luartes, 9/23/2016
// MP11_QuizGame: Make a quiz program with 10 questions. But will only display 5 random questions from the 10 questions you have. Every question has 10 points. If the user choose a wrong answer, it will deduct 5 points. User has 2 lives only. And if the user got a perfect score (50 points), a bonus question will appear to get another 50 points. A total of 100 points. Restriction is a must and the program will loop till the user wants to play. (If u want to add highscore, go lang.)
// Make the questions non-repeating

import java.util.Scanner;
import java.util.Random;

public class MP11_QuizGame {
	public static void main(String[] args) {
		String choice = "", choiceLower = "";
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		do {
			int num, score = 0, credits = 2;
			System.out.println("QUIZ GAME!!!");
			for (int i = 0; i < 5; i++) {
				num = 1 + r.nextInt(10);
				System.out.print("\nQ" + (i + 1));
				if (num == 1) {
					question1();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("a")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 2) {
					question2();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("c")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 3) {
					question3();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("a")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 4) {
					question4();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("b")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 5) {
					question5();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("a")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 6) {
					question6();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("c")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 7) {
					question7();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("c")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 8) {
					question8();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("c")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 9) {
					question9();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("d")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
				else if (num == 10) {
					question10();
					choice = keyboard.nextLine();
					choiceLower = choice.toLowerCase();
					if (choiceLower.equals("b")) {
						score = score + 10;
						System.out.println("Correct! Ten points! Score: " + score);
					}
					else {
						score = score - 5;
						credits = credits - 1;
						System.out.println("Wrong! Score: " + score);
						if (credits == 1) {
							System.out.println("You have 1 credit left. Do you want to continue? [Y/N]: ");
							choice = keyboard.nextLine();
							choiceLower = choice.toLowerCase();
							if (choiceLower.equals("n")) {
								System.out.println("Congrats! You got " + score + " points!");
								break;
							}
						}
						else if (credits == 0) {
							System.out.println("GAME OVER!");
							break;
						}
					}
				}
			}
			if (score == 50) {
				questionBonus();
				choice = keyboard.nextLine();
				choiceLower = choice.toLowerCase();
				if (choiceLower.equals("d")) {
					score = score + 50;
					System.out.println("Correct! Fifty points! Score: " + score);
				}
				else {
					System.out.println("Wrong! Score: " + score);
					System.out.println("GAME OVER!");
				}
			}

			System.out.print("\nDo you enter again? [Y/N]: ");
			choice = keyboard.nextLine();
		} while (choice.equals("Y") || choice.equals("y"));
	}
	public static void question1() {
		System.out.println(" Samite is a type of what?");
		System.out.println("a. Fabric");
		System.out.println("b. Stone");
		System.out.println("c. Dog");
		System.out.println("d. Cake");
		System.out.println("Answer: ");
	}
	public static void question2() {
		System.out.println(" Vermillion is a shade of which color?");
		System.out.println("a. Green");
		System.out.println("b. Blue");
		System.out.println("c. Red");
		System.out.println("d. Yellow");
		System.out.println("Answer: ");
	}
	public static void question3() {
		System.out.println(" In anatomy, 'plantar' relates to which part of the human body?");
		System.out.println("a. Foot");
		System.out.println("b. Stomach");
		System.out.println("c. Head");
		System.out.println("d. Hand");
		System.out.println("Answer: ");
	}
	public static void question4() {
		System.out.println(" Something annular is in the shape of a what?");
		System.out.println("a. Leaf");
		System.out.println("b. Ring");
		System.out.println("c. Brick");
		System.out.println("d. Pyramid");
		System.out.println("Answer: ");
	}
	public static void question5() {
		System.out.println(" Sfumato is a technique in what?");
		System.out.println("a. Painting");
		System.out.println("b. Cooking");
		System.out.println("c. Martial Arts");
		System.out.println("d. Meditation");
		System.out.println("Answer: ");
	}
	public static void question6() {
		System.out.println(" Which English royal house held the throne between 1154 and 1485?");
		System.out.println("a. Stewart");
		System.out.println("b. Tudor");
		System.out.println("c. Plantagenet");
		System.out.println("d. Lancaster");
		System.out.println("Answer: ");
	}
	public static void question7() {
		System.out.println(" If you dropped three solid steel spheres, weighing 1kg, 2kg and 3kg, at the same time from a height of ten metres, in what order would they hit the floor?");
		System.out.println("a. 1kg, 2kg, 3kg");
		System.out.println("b. 3kg, 2kg, 1kg");
		System.out.println("c. All at the same time");
		System.out.println("d. Some other order");
		System.out.println("Answer: ");
	}
	public static void question8() {
		System.out.println(" If something coruscates, what does it do?");
		System.out.println("a. Expands");
		System.out.println("b. Fades");
		System.out.println("c. Sparkles");
		System.out.println("d. Shrinks");
		System.out.println("Answer: ");
	}
	public static void question9() {
		System.out.println(" The port of Mocha is in which country?");
		System.out.println("a. Somalia");
		System.out.println("b. Oman");
		System.out.println("c. Iran");
		System.out.println("d. Yemen");
		System.out.println("Answer: ");
	}
	public static void question10() {
		System.out.println(" Which of the Rolling Stones has a cameo role as Captain Jack Teague, father of Jack Sparrow in 'Pirates of the Caribbean, At World's End'?");
		System.out.println("a. Mick Jagger");
		System.out.println("b. Keith Richards");
		System.out.println("c. Charlie Watts");
		System.out.println("d. Ronnie Wood");
		System.out.println("Answer: ");
	}
	public static void questionBonus() {
		System.out.println("\nBONUS: Melanophobia is the irrational fear of what?");
		System.out.println("a. Punishment");
		System.out.println("b. Fruit");
		System.out.println("c. Children");
		System.out.println("d. The color Black");
		System.out.println("Answer: ");
	}
}