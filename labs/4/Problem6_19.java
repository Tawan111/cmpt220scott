import java.util.Scanner;

public class Problem6_19 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter 3 sides for the triangle with a space between each number: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.println(isValid(side1, side2, side3) ? "The area is " + area(side1, side2, side3) : "Invalid input");
	}
	
	public static boolean isValid(	
		double side1, double side2, double side3) {
		boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
		return valid;
	}

	public static double area(
		double side1, double side2, double side3) {
		double i = (side1 + side2 + side3) / 2;
		return Math.sqrt(i * (i - side1) * (i - side2) * (i - side3));
	}
}