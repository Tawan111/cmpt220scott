import java.util.Scanner;

public class Problem4_21 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your social security number: ");
		String social = input.nextLine();
		
		boolean correct =
				social.length() == 11 &&
				(Character.isDigit(social.charAt(0)))&&
				(Character.isDigit(social.charAt(1)))&&
				(Character.isDigit(social.charAt(2)))&&
				(social.charAt(3) == "-")&&
				(Character.isDigit(social.charAt(4)))&&
				(Character.isDigit(social.charAt(5)))&&
				(social.charAt(6) == "-")&&
				(Character.isDigit(social.charAt(7)))&&
				(Character.isDigit(social.charAt(8)))&&
				(Character.isDigit(social.charAt(9)))&&
				(Character.isDigit(social.charAt(10)));
		System.out.println(social + " is " + ((correct) ? "a valid " : "not a valid ") + "social security number.");
		
				
	}
}
