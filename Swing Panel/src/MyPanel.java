
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class MyPanel extends JPanel {

	public MyPanel( ) {
		setBackground(Color.black);
	}
	
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    
	    // The paintComponent method is invoked 
	    // whenever paint event occurs.  This occurs 
	    // when the panel is
	    // (1) first displayed.
	    // (2) restored after being minimized.
	    // (3) exposed after being hidden.
	
        // Print title.
        g.setFont(new Font("arial", Font.BOLD, 30));
        g.setColor(Color.blue);
        g.drawString("by Akash", 60, 60);
        
        // Draw square.
        g.setColor(Color.yellow);
        g.fillRect(130, 190, 200, 200);
        g.setColor(Color.black);
        g.drawRect(130, 190, 200, 200);
        
        // Draw square 2.
        g.setColor(Color.red);
        g.fillRect(65, 160, 150, 85);
        g.setColor(Color.black);
        g.drawRect(65, 160, 150, 85);
        
        // Draw square 3.
        g.setColor(Color.red);
        g.fillRect(230, 160, 150, 85);
        g.setColor(Color.black);
        g.drawRect(230, 160, 150, 85);
        
        // Draw square 4.
        g.setColor(Color.orange);
        g.fillRect(130, 310, 200, 50);
        g.setColor(Color.black);
        g.drawRect(130, 310, 200, 50);
        
       
        // Draw circle.
        g.setColor(Color.cyan);
        g.fillOval(230, 200, 100, 100);
        g.setColor(Color.black);
        g.drawOval(230, 200, 100, 100);
        
        // Draw circle 2.
        g.setColor(Color.cyan);
        g.fillOval(130, 200, 100, 100);
        g.setColor(Color.black);
        g.drawOval(130, 200, 100, 100);
        
      
	}
}
