import java.util.*;

public class Problem9_13 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the rows and columns for the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] array = new double[rows][columns]; 
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		Location max = locateLargest(array);
		System.out.println("Location of largest element: " + max.maxValue + " at (" + max.row + ", " + max.column + ")");
	}

	public static Location locateLargest(double[][] a) {
		return new Location(a);
	}
}