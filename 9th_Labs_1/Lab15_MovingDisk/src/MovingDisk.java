//Author: Rithvik Muthyalapati
//Date: 11/2/18
//Version 2.0
//Version Notes:
//v.2.0: I added this header and previously added a moon in the night sky

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingDisk extends JPanel
  implements ActionListener
{
  private int time;

  public MovingDisk()
  {
    time = 0;
    
    Timer clock = new Timer(30, this); 
    clock.start();
  }

  public void paintComponent(Graphics g)
  {
    int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
    int y = 130 - (int)(75 * Math.sin(0.005 * Math.PI * time));
    int r = 20;
    int x2 = 150 - (int)(-100 * Math.cos(0.005 * Math.PI * time));//This causes the moon to move the same direction of the sun, but start in the opposite x position
    int y2 = 130 - (int)(-75 * Math.sin(0.005 * Math.PI * time));//This causes the moon to move the same direction of the sun, but start in the opposite y position

    Color sky;
    
    if (y > 130) 
    	sky = Color.BLACK;//When the sun goes down, it is night
    else
    	sky = Color.CYAN;//Otherwise, it's daytime
    
    setBackground(sky);
    super.paintComponent(g);

    g.setColor(Color.ORANGE);
    g.fillOval(x - r, y - r, 2*r, 2*r);//This is the sun
    g.setColor(Color.WHITE);
    g.fillOval(x2 - r, y2 - r, r, r);//This is the moon
    
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Moving Disk");
    w.setSize(300, 150);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new MovingDisk());
    w.setResizable(false);
    w.setVisible(true);
  }
}
