import java.util.Scanner;

public class Problem10_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.print("Smallest factors of " + number + " are: ");
		StackOfIntegers stack = new StackOfIntegers(); 
		smallestFactors(number, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println();
	}

	
	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2; 
		while (number / i != 1){ 
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			
			else
				i++;
		}
		
		stack.push(number);
	}
}