import java.util.Scanner;

public class Problem2_5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Don't forget to have a space between the two values.");
		System.out.print("Enter a subtotal value then the gratuity: ");
		double subtotal = input.nextDouble();
		double gratuity0 = input.nextDouble();
		double gratuity1 = (subtotal * gratuity0)/100;
		double total = subtotal + gratuity1;
		
		System.out.print("The gratuity is $" + gratuity1 + " and the total is $" + total + ".");
	}
}
