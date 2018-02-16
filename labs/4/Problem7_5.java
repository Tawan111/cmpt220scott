import java.util.Scanner;

public class Problem7_5 {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int[] number = new int[10];
	        int index = 0;
	        System.out.print("Enter ten numbers: ");

	        for (int i = 0; i < number.length; i++) {
	            int num = input.nextInt();
	            if (isNew(number, num)) {
	            number[index++] = num;
	        }
	    }
	        System.out.println("The number of distinct number is " + index);
	        System.out.print("The distinct numbers are: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(number[i] + " ");
	        }
	    }

	        public static boolean isNew(int[] n, int l) {
	        		for (int i : n){
	        		if (l == i) return false;
	        }
	        return true;
	    }
}






