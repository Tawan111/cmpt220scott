import java.util.Scanner;
import java.util.Random;

public class Problem3_17 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Scissor (0), Rock (1), Paper (2): ");
		int userInput = input.nextInt();
		Random randomNum = new Random();
		int computerChoice = randomNum.nextInt(3);
		
		if (userInput == 0 && computerChoice == 0) {
			System.out.print("The computer chose scissor. You chose scissor. It's a tie,");
		
		}
		else if (userInput == 0 && computerChoice == 1) {
			System.out.print("The computer chose rock. You chose scissor. You lose.");
		
		}
		else if (userInput == 0 && computerChoice == 2) {
			System.out.print("The computer chose paper. You chose scissor. You win.");
		}
		else if (userInput == 1 && computerChoice == 0) {
			System.out.print("The computer chose scissor. You chose rock. You win.");
		}
		else if (userInput == 1 && computerChoice == 1) {
			System.out.print("The computer chose rock. You chose rock. It's a tie.");
		}
		else if (userInput == 1 && computerChoice == 2) {
			System.out.print("The computer chose paper. You chose rock. You lose.");
		}
		else if (userInput == 2 && computerChoice == 0) {
			System.out.print("The computer chose scissor. You chose paper. You lose.");
		}
		else if (userInput == 2 && computerChoice == 1) {
			System.out.print("The computer chose rock. You chose paper. You win.");
		}
		else if (userInput == 2 && computerChoice == 2) {
			System.out.print("The computer chose paper. You chose paper. It's a tie.");
		}
		else {
			System.out.print("Invalid input");
		}
		}
		
	}



