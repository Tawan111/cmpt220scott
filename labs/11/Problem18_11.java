import java.util.Scanner;
	
public class Problem18_11 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long n = input.nextLong();
		System.out.println("Sum of " + n + " = " + sumDigits(n));
	}

	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}

	private static int sumDigits(long n, int sum) {
		if (n == 0) 
			return sum;
		else 
			return sumDigits(n / 10, sum + (int)(n % 10));
	}
}