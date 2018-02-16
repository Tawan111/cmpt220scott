import java.util.Scanner;

public class Problem2_5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Make sure to have a space between each values");
		System.out.print("Enter the subtotal then the gratuity: ");
		double subtotal = input.nextDouble();
		double gratuity0 = input.nextDouble();
		double gratuity1 = (subtotal * gratuity0)/100;
		double total = subtotal + gratuity1;
		
		System.out.print("Gratuity is $" + gratuity1 + " and the total is $" + total + ".");
	}
}
