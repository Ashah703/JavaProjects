
// BarChart Example
// Source code file LineChart.java 
// Create a bar chart using JFreeChart library.
//
// JAR files jcommon-1.0.23.jar and jfreechart-1.0.19.jar 
// must be added to project.

import java.io.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartUtilities; 
public class BarChart {  
    public static void main(String[] args) {
        try {
               
            // Define data for line chart.
            DefaultCategoryDataset barChartDataset = 
                new DefaultCategoryDataset();
            barChartDataset.addValue(1435, "total", "East");
            barChartDataset.addValue(978,  "total", "North");
            barChartDataset.addValue(775,  "total", "South");                
            barChartDataset.addValue(1659, "total", "West");                
                
            // Define JFreeChart object that creates line chart.
            JFreeChart barChartObject = ChartFactory.createBarChart(
                "Sales ($1000)", "Region", "Sales", barChartDataset,
                PlotOrientation.VERTICAL, 
                false,  // Include legend.
                false,  // Include tooltips.
                false); // Include URLs.               
                          
             // Write line chart to a file.               
             int imageWidth = 640;
             int imageHeight = 480;                
             File barChart = new File("sales.png");              
             ChartUtilities.saveChartAsPNG(
                 barChart, barChartObject, imageWidth, imageHeight); 
        }
      
        catch (Exception i)
        {
            System.out.println(i);
        }
    }
}

