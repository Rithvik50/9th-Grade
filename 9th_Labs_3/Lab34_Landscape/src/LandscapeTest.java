import java.awt.Color;
import javax.swing.JFrame;

public class LandscapeTest {
	  
	public static void main(String[] args)
	{
	    JFrame w = new JFrame("Scenic Landscape");
	    w.setBounds(100, 100, 800, 600);
	    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Landscape panel = new Landscape();
	    panel.setBackground(Color.WHITE);
	    w.addKeyListener(panel);
	    panel.addMouseListener(panel);
	    w.add(panel);
	    w.setResizable(true);
	    w.setVisible(true);
    }
}
