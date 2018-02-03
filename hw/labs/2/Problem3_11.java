import java.util.Scanner;

public class Problem3_11 {

		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month as a number: ");
		int month = input.nextInt();
		System.out.print("Enter the year as a number: ");
		int year = input.nextInt();
		int months = month;
		String monthString;
		switch (months) {
			case 0: monthString = "January";
			break;
			case 1: monthString = "February";
			break;
			case 2: monthString = "March";
			break;
			case 3: monthString = "April";
			break;
			case 4: monthString = "May";
			break;
			case 5: monthString = "June";
			break;
			case 6: monthString = "July";
			break;
			case 7: monthString = "August";
			break;
			case 8: monthString = "September";
			break;
			case 9: monthString = "October";
			break;
			case 10: monthString = "November";
			break;
			case 11: monthString = "December";
			break;
			default: monthString = "Not a real month of the year ";
			break;
		}
		
		if (month ==1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
			System.out.println("Month of " + monthString + " of year " + year + " has 31 days");
		}
		else if (month == 2) {
			boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
			if (isLeapYear == true) {
				System.out.println("February " + year + " has 29 days");
			}
			else {
				System.out.println("February " + year + " has 28 days");
			}
		}
		else if (month == 4 | month == 6 | month == 9 | month == 11) {
			System.out.println("Month of " + monthString + " of year " + year + " has 30 days");
		}
		else {
			System.out.print("That was not a month.");
		}
			}
			


}
