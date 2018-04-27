import java.util.Scanner;

public class Problem18_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string and a character: ");
		String[] str = input.nextLine().split("[ ]");
		System.out.println("The character \'" + str[1] + "\' occurs " +
			count(str[0], str[1].charAt(0)) + " times in \"" + str[0] + "\".");
	}

	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}
	
	private static int count(String str, char a, int high) {
		if (high < 0) 
			return 0;
		else if (str.charAt(high) ==  a) {
			return 1 + count(str, a, high - 1); 
		}
		else
			return count(str, a, high - 1); 
	}
}