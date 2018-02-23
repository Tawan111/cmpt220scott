import java.util.Scanner;

public class proj1 {
	 
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	int n = input.nextInt();
	int[] sheets = new int[n]; 
	for (int i = 1; i < n; i++)
		sheets[i] = input.nextInt();
	
	double[] tape = new double[n]; 
    for (int i = 1; i < n; i++) 
    		tape[i] = Math.pow(2, ((double)(-1 - i * 2)) / 4.0);

	double tapeUsed = 0;
    int nextPageSizeNeeded = 1;
	for (int i = 0; i < n; i++) {
		tapeUsed += tape[i] * ((double)(nextPageSizeNeeded / 2)); 
	      
	if (sheets[i] >= nextPageSizeNeeded) {
	    nextPageSizeNeeded = 0;
	      
	      } 
	else
	    nextPageSizeNeeded = (nextPageSizeNeeded - sheets[i]) * 2;

	    }
	   
	if (nextPageSizeNeeded > 0)
	    System.out.println("impossible");
    else
	    System.out.println(tapeUsed);
	  }

	}

