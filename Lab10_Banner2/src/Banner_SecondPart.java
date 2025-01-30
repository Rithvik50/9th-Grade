// This applet displays a banner that changes messages after two seconds and moves from right to left//

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Banner_SecondPart extends JApplet
  implements ActionListener
{
  private int xPos, yPos;  // hold the coordinates of the banner
  private int msgID = 1;//msgID's value is 1 and will be toggled after two seconds to -1//
  int counter = 0;//I created new variable to toggle after two seconds//
  
//  java.util.Timer flipTimer = new java.util.Timer();
//  flipTimer.schedule(new ResetFlag(), 1000);


  public void init()
  {
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    xPos = c.getWidth();
    yPos = c.getHeight() / 2;

    //ActionListener taskPerformer = new ActionListener();
    Timer clock = new Timer(40, this); // fires and moves the text every 40 milliseconds//
    clock.start();
  }

  // Called automatically after a repaint request
  public void paint(Graphics g)
  {
    super.paint(g);
    Container c = getContentPane();
    //int xPos = c.getWidth() / 2 - 30;
    //int yPos = c.getHeight() / 2;
    
    if (msgID == 1) {//This if else statement checks the value of msgID and prints the respective message after two second intervals.//
    	g.setColor(Color.BLUE);//Just for fun, I used the java logo colors to print these messages with style//
    	g.drawString("East or West", xPos, yPos);
    }
    else {
       g.setColor(Color.ORANGE);
 	   g.drawString("Java is Best", xPos, yPos);
    }
    
  }

  // Called automatically when the timer fires
  public void actionPerformed(ActionEvent e)
  {
	 counter++;//Increasing the variable counter by one//
	   if(counter == 50) {//Not measured in milliseconds, it is actually measured based on how fast the program iterates. This number times the timer milliseconds makes the text toggle after 2 seconds//
	    counter = 0;//Resets counter to 0//
	    msgID = -msgID;//Toggles msgID to negative value//
	   }

    Container c = getContentPane();
    // Adjust the horizontal position of the banner:
    xPos--;//Decreases xPos by one everytime//
    if (xPos < -100)//xPos is less than -100, it will reset the xPos to the very right of the screen//
    {
      xPos = c.getWidth();
    }

    // Set the vertical position of the banner:
    yPos = c.getHeight() / 2;
    // msgID = -msgID;
    
    repaint();
  }
//I looked up on eclipse and I couldn't find anything related 
}


