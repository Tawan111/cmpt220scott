import java.util.Scanner;
import java.util.Random;

public class Problem3_17 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userInput = input.nextInt();
		Random randomNum = new Random();
		int computerChoice = randomNum.nextInt(3);
		
		if (userInput == 0 && computerChoice == 0) {
			System.out.print("The computer is scissor. You are scissor. It's a tie,");
		
		}
		else if (userInput == 0 && computerChoice == 1) {
			System.out.print("The computer is rock. You are scissor. You lose.");
		
		}
		else if (userInput == 0 && computerChoice == 2) {
			System.out.print("The computer is paper. You are scissor. You win.");
		}
		else if (userInput == 1 && computerChoice == 0) {
			System.out.print("The computer is scissor. You are rock. You win.");
		}
		else if (userInput == 1 && computerChoice == 1) {
			System.out.print("The computer is rock. You are rock. It's a tie.");
		}
		else if (userInput == 1 && computerChoice == 2) {
			System.out.print("The computer is paper. You are rock. You lose.");
		}
		else if (userInput == 2 && computerChoice == 0) {
			System.out.print("The computer is scissor. You are paper. You lose.");
		}
		else if (userInput == 2 && computerChoice == 1) {
			System.out.print("The computer is rock. You are paper. You win.");
		}
		else if (userInput == 2 && computerChoice == 2) {
			System.out.print("The computer is paper. You are paper. It's a tie.");
		}
		else {
			System.out.print("No one won");
		}
		}
		
	}



