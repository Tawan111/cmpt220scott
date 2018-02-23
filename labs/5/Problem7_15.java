import java.util.Scanner;

public class Problem7_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[10]; 
		System.out.print("Enter ten number: ");
		for (int i = 0; i < num.length; i++)
			num[i] = input.nextInt();

		int[] distinctNumbers = eliminateDuplicates(num);
		System.out.print("The distinct numbers are: ");
		for (int d: distinctNumbers) {
			if (d > 0)
				System.out.print(" " + d);
		}
		
		System.out.println();
	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] distinct = new int[list.length];
		int i = 0;	
		for (int d: list) {
			if (linearSearch(distinct, d) == -1) {
				distinct[i] = d;
				i++;
			}
		}
		
		return distinct;
	}

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		
		return -1;
	}

	}

