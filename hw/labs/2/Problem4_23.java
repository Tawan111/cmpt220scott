import java.util.Scanner;

public class Problem4_23 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked per week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay: ");
		double hourlyPay = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		double grossPay = hoursWorked * hourlyPay;
		double fedralWithHolding = grossPay * federalTax;
		double stateWithHolding = grossPay * stateTax;
		double netPay = (grossPay - fedralWithHolding) - stateWithHolding; 
		double federalT = federalTax * 100;
		double stateT = stateTax * 100;
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: $" + hourlyPay);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("    Federal Withholding (" + federalT + "): $" + fedralWithHolding);
		System.out.println("    State Withholding (" + stateT + "): $" + stateWithHolding);
		System.out.println("    Total Deduction: $" + (fedralWithHolding + stateWithHolding));
		System.out.println("Net pPay: $" + netPay);
		
	}
}
