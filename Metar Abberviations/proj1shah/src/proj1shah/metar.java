// Akash Shah 

// Project 1 

// 01/12/2019


package proj1shah;
import java.util.Scanner; // imports scanner 

import proj1shah.metar;

//main class created 

public class metar {

	public static void main(String[] args) {
		
		// Scanner initialize 
		
		Scanner scanner = new Scanner(System.in);
		
		// enables the user to receive feedback
		
		
		// scans the information by matching the variable
		
		System.err.print("Input the METAR Abbreviation: "); 
		String abv = scanner.nextLine( ); 
		
		// Abbreviation
		
		if (abv.equals("B"))  {
	        System.out.println ("Began At Time ");
	    }
	    else if(abv.equals("+")) {
	        System.out.println ("Heavy intensity");
	    }
	    else if(abv.equals("-")) {
	        System.out.println ("Light intensity");
	    }
	    else if(abv.equals("DZ")) {
	        System.out.println ("Drizzle");
	    }
	    else if(abv.equals("E")) {
	        System.out.println ("Ended At Time");
	    }
	    else if(abv.equals("HZ")) {
	        System.out.println ("Haze");
	    }
	    else if(abv.equals("RA")) {
	        System.out.println ("Rain");
	    }
	    else if(abv.equals("SN")) {
	        System.out.println ("Snow");
	    }
	    
	    else {
	        System.out.println("Unknown Abbreviation");
	    }
	    
	
	    
	    //Close scanner
	    scanner.close( );
	    }
	
		
		
		
		
		
		
		
		
		
		

	}


