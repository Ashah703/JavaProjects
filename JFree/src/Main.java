// imports 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

// main class created

public class Main {
	
	// this calls the string [] args 
	
	public static void main(String[] args) throws IOException {
		
		// opens the currency file 
		
		File file = new File("currencies.txt");
		
		
		Scanner in1 = null;
		try {
			in1 = new Scanner(file);
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		

		DefaultCategoryDataset barChartDataset = new DefaultCategoryDataset();
		while	(in1.hasNextLine()){
		
		
			//this will set the target currency into affect 
		
			String targetCurrency = in1.nextLine();
			System.out.println(targetCurrency);
			String prefix = "http://data.fixer.io/api/latest";
			String accessKey = "?access_key=0ba62774008a100fa7c944a01604934b";
			String insert = "&symbols=";
			String urlString = prefix + accessKey + insert + targetCurrency; 
			System.out.println(urlString);
			  
			//creats the URL object 
			
			URL url = null;
			
			try {
				
			url = new URL(urlString);
			} catch (MalformedURLException e) {
			
				e.printStackTrace();
				
				System.exit(1);
			}
			
			Scanner s = null;
			try {
				s = new Scanner(url.openStream( ));
			} catch (IOException e) {
			
				e.printStackTrace();
				
				System.exit(1);
			}
		//$getJSON is called here 
			 
			String jsonString = s.nextLine( );
			    System.out.println(jsonString);
			    int start = jsonString.indexOf(targetCurrency) + 5; 
				int end = jsonString.length( ) - 2;
			    double exchangeRate = Double.parseDouble(jsonString.substring(start, end));
			    
			    barChartDataset.addValue(exchangeRate, "total", targetCurrency);
			 
			    // scanner close 
			    
			    s.close();
		}      
		
		in1.close(); 
		
		// the code below allows the bar graph to be created 
		
		   JFreeChart barChartObject = ChartFactory.createBarChart(
	                
				   "Sales ($1000)", "Region", "Sales", barChartDataset,
	                PlotOrientation.VERTICAL, 
	                false,  // Include legend.
	                false,  // Include tooltips.
	                false); // Include URLs.               
	                          
	             // Write line chart to a file.               
	             int imageWidth = 640;
	             int imageHeight = 480;                
	             File barChart = new File("curriences.png");              
	             ChartUtilities.saveChartAsPNG(
	                barChart, barChartObject, imageWidth, imageHeight); 
	        }
	      
	      
	        
	
		
	 
		// write file line
	
		             int imageWidth = 640;
		             int imageHeight = 480; 
		             File barChart = new File("image.png");  
}



