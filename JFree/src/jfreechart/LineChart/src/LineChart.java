// LineChart Example
// Source code file LineChart.java 
// Create a line chart using JFreeChart library.
//
// JAR files jcommon-1.0.23.jar and jfreechart-1.0.19.jar 
// must be added to project.

import java.io.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartUtilities; 
public class LineChart {  
    public static void main(String[] args) {
        try {
               
            // Define data for line chart.
            DefaultCategoryDataset lineChartDataset = 
                new DefaultCategoryDataset();
            lineChartDataset.addValue(15, "schools", "1970");
            lineChartDataset.addValue(30, "schools", "1980");
            lineChartDataset.addValue(60, "schools", "1990");
            lineChartDataset.addValue(120, "schools", "2000");
            lineChartDataset.addValue(240, "schools", "2010");                
                
            // Define JFreeChart object that creates line chart.
            JFreeChart lineChartObject = ChartFactory.createLineChart(
                "Schools Vs Years", "Year", "Schools Count", lineChartDataset,
                PlotOrientation.VERTICAL, 
                true,   // Include legend.
                true,   // Include tooltips.
                false); // Don't include URLs.               
                          
             // Write line chart to a file.               
             int imageWidth = 640;
             int imageHeight = 480;                
             File lineChart = new File("line-chart.png");              
             ChartUtilities.saveChartAsPNG(
                 lineChart, lineChartObject, imageWidth, imageHeight); 
        }
      
        catch (Exception i)
        {
            System.out.println(i);
        }
    }
}

