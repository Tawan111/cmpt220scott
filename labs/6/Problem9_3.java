import java.util.*;

public class Problem9_3 {
	 
	public static void main(String[] args) {
		int time = 10000;
	    for (int i = 0; i < 8; i++, time *= 10) {
	    		Date date = new Date(time);
	        System.out.println(date.toString());
	        
	    }
	    
	}
	
}

