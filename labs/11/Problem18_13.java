import java.util.Scanner;

public class Problem18_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 8 integers: ");
		int[] list = new int[8]; 
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}

		System.out.println("Largest element is: " + max(list));
	}

	public static int max(int[] list) {
		int max = list[list.length - 1]; 
		int index = list.length - 1; 
		return max(list, index, max);
	}

	private static int max(int[] list, int index, int max) {
		if (index < 0) 
			return max;
		else if (list[index] > max) { 
			return max(list, index - 1, list[index]); 
		}
		else
			return max(list, index - 1, max);
	}
}