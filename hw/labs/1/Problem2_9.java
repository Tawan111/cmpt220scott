import java.util.Scanner;

public class Problem2_9 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Don't forget to have a space between the three values.");
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double answer = (v1 - v0)/t;
		System.out.print("The average acceleration is " + answer + " .");
	}
}
