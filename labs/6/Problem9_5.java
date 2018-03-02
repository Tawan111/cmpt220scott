import java.util.*;

public class Problem9_5 {

	public static void main(String[] args) {
		GregorianCalendar calender = new GregorianCalendar();
		System.out.print("Current date: ");
		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		calender.setTimeInMillis(1234567898765L);
		System.out.print("Elapsed time since January 1, 1970: ");
		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}
