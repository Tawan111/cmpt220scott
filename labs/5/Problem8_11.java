import java.util.Scanner;

public class Problem8_11 {
	
	public static int[] decimalToBinary(int decimal) {
	int[] num = new int[9];
	for (int i = num.length-1;i>=0 && decimal >0;i--) {
		if ( decimal% 2 == 0)
			 num[i] = 0;
		else
			 num[i] = 1;
		     decimal /= 2;

	}

	return num;
	
}
	
	public static void headsAndTails(int[] num) {
	for (int i =0; i<9;i++) {
		if (num[i] == 0) System.out.print("H ");
		else  System.out.print("T ");
		if ((i+1) % 3 == 0) System.out.println();
		
	}
}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number between 0 and 511: ");
		int number = scan.nextInt();
		int[] num = decimalToBinary(number);
		headsAndTails(num);

	}
}