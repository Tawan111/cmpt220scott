import java.util.Scanner;

public class Problem2_1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a celsius value: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		System.out.print("The answer is " + fahrenheit +" .");
	}
}
