
public class Problem6_13 {

	public static void main(String[] args) {
		  
		  System.out.printf("%-5s%-5s\n","i", "m(i)");
		  System.out.println(String.format("%13s", "").replace(' ', '-'));
		  for (int i = 1; i <= 20; i++) {
		  System.out.printf("%-5d%-5.4f\n",i,sum(i));
		  
		 }
	
	}
		  
	 public static double sum(int n) {
		 
		 double sum=0;
		 for (int i = 1; i <= n; i++) {
		 sum+= 1.0*i/(i+1);
		  }
     return sum; 
		   
		 }
		 
		}