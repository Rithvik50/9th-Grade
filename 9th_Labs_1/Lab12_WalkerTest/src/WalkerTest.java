import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WalkerTest extends JPanel
{
  private Image leftShoe;
  private Image rightShoe;

  // Constructor
  public WalkerTest()
  {
    leftShoe = (new ImageIcon("leftshoe.gif")).getImage();
    rightShoe = (new ImageIcon("rightshoe.gif")).getImage();
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int x = 300;
    int y = 300;
    // Draw a cursor at the expected center of the first "shoe":
    g.drawLine(x - 50, y, x + 50, y);
    g.drawLine(x, y - 50, x, y + 50);

  //  int stepLength = 200;
    
    Walker stepper = new Walker(x, y, leftShoe, rightShoe);
    stepper.draw(g);//I am calling each method in a repetitive pattern
    stepper.firstStep();
    stepper.nextStep();
    stepper.stop();
    stepper.draw(g);
    stepper.firstStep();
    stepper.nextStep();
    stepper.stop();
    //stepper.draw(g);
    stepper.firstStep();
    stepper.nextStep();
    stepper.stop();
    stepper.draw(g);
    
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 1000, 500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    WalkerTest panel = new WalkerTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}