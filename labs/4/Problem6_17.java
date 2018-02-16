import java.util.Scanner;

public class Problem6_17 {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter n: ");
	    int num = input.nextInt();
	    input.close();
	    matrix(num);
	}

	public static void matrix(int i) {
	    for (int column = 0; column < i; column++) {
	    for (int row = 0; row < i; row++) {
	    System.out.printf("%1d ", (int) (Math.random() * 2));
	    
	    }
	    
	    System.out.println("");
	    }
	    
	}
}