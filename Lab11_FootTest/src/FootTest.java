import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTest extends JPanel
{
  private Image shoe;

  // Constructor
  public FootTest()
  {
    shoe = (new ImageIcon("leftshoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = 100;
    int y = 400;
    int stepLength = 100;
    int interval = 100;

    Foot foot = new Foot(x, y, shoe);//I tried using forloops but it doesn't work because I need to show one foot
    foot.turn(270);
    foot.draw(g);

    Foot foot1 = new Foot(x + interval, y, shoe);
    foot1.turn(270);
    foot1.draw(g);

    Foot foot2 = new Foot(x + interval * 2, y, shoe);
    foot2.turn(270);
    foot2.draw(g);

    Foot foot3 = new Foot(x + interval * 3, y, shoe);
    foot3.turn(270);
    foot3.draw(g);
    
//    for(int h = 0; h < 4; h++) {
//    	foot.draw(g);
//    	foot.moveForward();
//    }
    
 // Draw a cursor at the expected center of the first "shoe":
    //g.drawLine(x - 50, y, x + 50, y);
    //g.drawLine(x, y - 50, x, y + 50);
    
    /*int x = 235;
    int y = 165;
    int stepLength = 100;

    Foot foot = new Foot(x, y, shoe);
    foot.turn(0);
    foot.draw(g);
    x -= 50;
    y += 50;
    
    Foot foot2 = new Foot(x, y, shoe);
    foot2.turn(270);
    foot2.draw(g);
    x += 50;
    y += 50;
    
    Foot foot3 = new Foot(x, y, shoe);
    foot3.turn(180);
    foot3.draw(g);
    x += 50;
    y -= 50;
    
    Foot foot4 = new Foot(x, y, shoe);
    foot4.turn(90);
    foot4.draw(g);*/
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 500, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FootTest panel = new FootTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}