import java.util.Scanner;

public class Problem6_3 {
	  
	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter an integer to find out if it's a palindrome: ");
		    int userInputNum = input.nextInt();
		    
		    System.out.println((isPalindrome(userInputNum)));
		  }

		  public static int reverse(int number){
		  	
		  	int lastDigit = 0;
		  	int reverseNum = 0;
		  	
		  	while(number>0){
		  	  
		  	  reverseNum = reverseNum*10;
		  	  lastDigit = number%10; 
		  	  reverseNum = reverseNum+lastDigit;
		  	  number = number/10; 
		  	}
		  
		  return reverseNum;
		  }
		 
		  public static boolean isPalindrome(int number){
		  	boolean answer;
		  	
		  	if((reverse(number))==number){
		  	  answer = true;
		  	}
		  
		  	else {
		  	  answer = false;
		  	}
		  	return answer;
		  }
		}

