import java.util.Calendar;





public class MyCalendar {
	
	public static String dayOfWeek (int month, int day, int year) {
	
	String[ ] dayNames = {"", "Sunday", "Monday", "Tuesday", 
		    "Wednesday", "Thursday", "Friday", "Saturday"};
	
	
	Calendar cal = Calendar.getInstance();
	
	cal.set (year, month -1, day);
	
	int d = cal.get(Calendar.DAY_OF_WEEK);
	
	return dayNames[d];
	
	
	
		
}

}