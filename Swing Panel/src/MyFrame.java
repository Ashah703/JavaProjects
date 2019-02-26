import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	private MyPanel p;
    public MyFrame()
    {
        super("Drawing Example");
        p = new MyPanel();
        p.setLayout(new FlowLayout());
       
        setContentPane(p);
        setSize(400, 500);
        setVisible(true);
    }
}

