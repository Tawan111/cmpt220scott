import java.util.Scanner;

public class Problem5_1 {
	
	public static void main(String[] args) {
		double sum = 0;
			int negNumCount = 0;
			int posNumCount = 0;
			double avgNum = 0;
			int userInputNum;
			do {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter an integer, input ends if it is 0: ");
				userInputNum = input.nextInt();
				
				if(userInputNum>0) {
					posNumCount++;
				}
				else if(userInputNum<0) {
				}
				sum+= userInputNum;
			} while (userInputNum !=0);
			avgNum = sum/(posNumCount + negNumCount);
				
				if((negNumCount == 0)&&(posNumCount == 0)) {
					System.out.println("No numbers are entered except 0");
				}
				else {
					  System.out.println("The number of positives is " + posNumCount);
				      System.out.println("The number of negatives is " + negNumCount);
				      System.out.println("The total is " + sum);
				      System.out.println("The average is " + avgNum);
				}
			}
	}

