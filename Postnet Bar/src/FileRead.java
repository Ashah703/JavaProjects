import java.io.*;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileRead {

		   public static void main(String[] args) throws Exception {
		       readFile();
		   }

		   // Use JFileChooser to select file
		   public static void readFile() throws Exception {
			   
			   File file = new File("addresses.txt");
		       Scanner S  = new Scanner(file);
			   
			   
		       JFileChooser chooser = new JFileChooser();
		       int filename = chooser.showOpenDialog(null);
		       if (filename == JFileChooser.APPROVE_OPTION) {
		           File f = chooser.getSelectedFile();
		           Scanner scan = new Scanner(new FileReader(f));

		    
		           
		           
		           // iterate through each line of file, invoke getBarCode() for each
		           // line and print the result
		           
		           
		           while (scan.hasNextLine()) {
		               String line = scan.nextLine();
		               String [ ] fields = line.split(" , " );
		           
		               String name = fields[0].trim();
		               String address = fields[1].trim();
		               String city = fields[2].trim();
		               String state = fields[3].trim();
		               String zipcode = fields[4].trim();
		               String barcode = BarCode.getBarCode(zipcode);
		               
		               System.out.println(name);
		               System.out.println(address);
		               System.out.println(city); 
		               System.out.println(state);
		               System.out.println(zipcode);
		            
		             
		         
		               System.out.println(barcode);
		           }

		           scan.close();
		           S.close();
		       }
		   }

		
}
