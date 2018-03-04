import java.util.*;

public class Problem9_3 {
	 
	public static void main(String[] args) {
		long time = 10000; // JA
	    for (int i = 0; i < 8; i++, time *= 10) {
	    		Date date = new Date(time);
	        System.out.println(date.toString());
	        
	    }
	    
	}
	
}

