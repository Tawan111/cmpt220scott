import java.util.Scanner;

public class Problem2_9 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Make to have a space between each value");
		System.out.print("Enter a0, a1, and b: ");
		double a0 = input.nextDouble();
		double a1 = input.nextDouble();
		double b = input.nextDouble();
		double answer = (a1 - a0)/b;
		System.out.print("Average acceleration is " + answer + " .");
	}
}
