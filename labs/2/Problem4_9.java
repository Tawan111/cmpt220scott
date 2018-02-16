import java.util.Scanner;

public class Problem4_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char userInput = input.next().charAt(0);
		int answer = (int) userInput;
		System.out.println(answer);
	}
}
