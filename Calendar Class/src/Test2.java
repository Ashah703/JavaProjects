import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Test2 {
	
	
	@Test
	
	void test() {
		
		
		assertEquals(MyCalendar.dayOfWeek(1, 29, 2019), "Tuesday");
		assertEquals(MyCalendar.dayOfWeek(1, 28, 2019), "Monday");
		assertEquals(MyCalendar.dayOfWeek(1, 27, 2019), "Sunday");
		assertEquals(MyCalendar.dayOfWeek(1, 26, 2019), "Saturday");
		assertEquals(MyCalendar.dayOfWeek(1,1,1996), "Monday");
		
		
		
	}
	
	
}