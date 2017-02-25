import java.util.GregorianCalendar;

public class NineDot5 {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		int year = calendar.get(GregorianCalendar.YEAR);
		// Gregorian calendar starts its index at 0. ex 0 = January
		int month = calendar.get(GregorianCalendar.MONTH) + 1;
		int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println("The current date is " + month + "/" + day + "/" + year);
		
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.setTimeInMillis(1234567898765L);
		
		int year2 = calendar2.get(GregorianCalendar.YEAR);
		// Gregorian calendar starts its index at 0. ex 0 = January
		int month2 = calendar2.get(GregorianCalendar.MONTH) + 1;
		int day2 = calendar2.get(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println("The specified date is " + month2 + "/" + day2 + "/" + year2);
	}
}
