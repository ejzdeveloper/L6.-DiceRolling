// Author: Jackie Zablah. Java Bootcamp 2019.
package lab6;
import java.util.Random;
import java.util.Scanner;
public class DiceRolling {

	
	public static int generateRandomDieRoll(int numSides) {
		Random random = new Random();
		
		int numRandom = random.nextInt(numSides) + 1;
		return numRandom ;
	}
	
	public static void boxCars(int dice1, int dice2) {
		if (dice1 == 6 && dice2 == 6) 
			System.out.println("Box Cars");
	}
	
	public static void snakeEyes(int dice1, int dice2) {
		if (dice1 == 1 && dice2 == 1)
			System.out.println("Snake Eyes");
	}
			
	public static void craps(int dice1, int dice2) {
	    if ((dice1 == 3 && dice2 == 2) || (dice1 == 2 && dice2 == 3)) 
			System.out.println("Craps");
		}
		
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int sides;	
		String userChoice = "";
		int i = 1;
		int dice1;
		int dice2;
		System.out.println(">>Welcome to the Gran Circus Casino!");
		
		System.out.println(">>How many sides should each die have? << ");
		sides = scnr.nextInt();
		
		do {
			System.out.println("Roll " + i + ":");	
			dice1 = generateRandomDieRoll(sides);
			System.out.println(dice1);
			dice2 = generateRandomDieRoll(sides);
			System.out.println(dice2);
			
			boxCars(dice1, dice2);
			snakeEyes(dice1, dice2);
			craps(dice1, dice2);
						
			System.out.print(">> Roll again? (y/n)?");
			userChoice = scnr.next();
			i++;
			
			if (userChoice.equalsIgnoreCase("n")) {
				System.out.println(">> Thank you for playing!, Goodbye!");
			}

		} while (userChoice.equalsIgnoreCase("y"));
		scnr.close();

	}
}


