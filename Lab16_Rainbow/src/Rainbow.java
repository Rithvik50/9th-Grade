//Author: Rithvik Muthyalapati
//Date: 11/1/18
//Version: 1.0
//Version Notes:
//v.1.0: added the other rainbow rings of the colors green, magenta, and cyan


import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  private final Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

	int xCenter = width / 2;
	int yCenter = height * 3 / 4;
	int redRadius = width / 4;
	int greenRadius = redRadius - redRadius / 4;
	int magentaRadius = redRadius - redRadius / 2;
	int cyanRadius = redRadius - 3 * redRadius /4; 
	
	g.setColor(Color.RED);
	g.fillArc(xCenter - redRadius, yCenter - redRadius, redRadius * 2, redRadius * 2, 0, 180);//Drew the arcs here and I used the slideshow as a reference
	g.setColor(Color.GREEN);
	g.fillArc(xCenter - greenRadius, yCenter - greenRadius, greenRadius * 2, greenRadius * 2, 0, 180);//This arc is 3/4 the redRadius of the red arc
	g.setColor(Color.MAGENTA);
	g.fillArc(xCenter - magentaRadius, yCenter - magentaRadius, magentaRadius * 2, magentaRadius * 2, 0, 180);//This arc is 1/2 the redRadius of the magenta arc
	g.setColor(skyColor);
	g.fillArc(xCenter - cyanRadius, yCenter - cyanRadius, cyanRadius * 2, cyanRadius * 2, 0, 180);//This arc is 1/4 the redRadius of the cyan arc

  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}