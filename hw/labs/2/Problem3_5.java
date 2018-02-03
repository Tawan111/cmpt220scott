import java.util.Scanner;

public class Problem3_5 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter today's day: ");
			int todaysDay = input.nextInt();
			System.out.print("Enter the number of days to elapsed since today: ");
			int daysToPass = input.nextInt();
			int days = todaysDay;
			String daysString;
			switch (days) {
			
				case 0: daysString = "Sunday";
				break;
				case 1: daysString = "Monday";
				break;
				case 2: daysString = "Tuesday";
				break;
				case 3: daysString = "Wednesday";
				break;
				case 4: daysString = "Thursday";
				break;
				case 5: daysString = "Friday";
				break;
				case 6: daysString = "Saturday";
				break;
				default: daysString = "Not a real day of the week 0 to 7";
				break;
			}
			int nextDays = (todaysDay + daysToPass )%7;
			String nextDaysString;
			switch (nextDays) {
				
				case 0: nextDaysString = "Sunday";
				break;
				case 1: nextDaysString = "Monday";
				break;
				case 2: nextDaysString = "Tuesday";
				break;
				case 3: nextDaysString = "Wednesday";
				break;
				case 4: nextDaysString = "Thursday";
				break;
				case 5: nextDaysString = "Friday";
				break;
				case 6: nextDaysString = "Saturday";
				break;
				default: nextDaysString = "Not a real day of the week 1 to 7";
				break;
			}
			System.out.println("It is " + daysString + ". The future day will be a  " + nextDaysString + ".");
			}
		
		}

