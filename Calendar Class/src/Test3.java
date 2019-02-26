import java.util.Calendar;
import java.util.Scanner;

//Akash Shah

//01/28/2019

// project 2b 

//static void main initialized for "proj2bshah"


public class Test3 {

public static void main(String[] args) {
		
		// created Scanner
		
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance(); 
		
		
		// assigning variables 
		
		int year, month, day; 
		
		// creating while loop
		
		while (true) {
			
			// creating input messages for user
			
			System.out.print("Enter Year:");
			year = S.nextInt(); 
			
			System.out.print("Enter Month: "); 
			month = S.nextInt(); 
			
			System.out.print("Enter Day: ");
			day = S.nextInt(); 
			
			
			cal.set(year, month, day); 
			
			System.out.println("Day of the Week is" + MyCalendar.dayOfWeek(month, day, year));
			
		}
		

	
																				
}

}
