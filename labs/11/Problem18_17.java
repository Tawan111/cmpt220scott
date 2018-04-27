import java.util.Scanner;

public class Problem18_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of characters in one line and a character: ");
		String str = input.nextLine();
		char[] chars = new char[str.length() - 1];
		for (int i = 0; i < chars.length; i++)
			chars[i] = str.charAt(i);
		char ch = str.charAt(str.length() - 1);

		System.out.println("The character \"" + ch + "\" occurs " + count(chars, ch) + " times in the list \"" + str.substring(0, str.length() - 1) + "\".");
	}

	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}

	public static int count(char[] chars, char ch, int high) {
		if (high < 0) 
			return 0;
		else if (chars[high] == ch) 
			return 1 + count(chars, ch, high - 1); 
		else
			return count(chars, ch, high - 1); 
	}
}