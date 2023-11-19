// This class represents a walker with two feet.

import java.awt.Image;
import java.awt.Graphics;

public class Walker
{
  public static final int PIXELS_PER_INCH = 6;
  private Foot leftFoot, rightFoot;
  private int stepLength;//attributes of Walker.java
  private int stepsCount;
  
  // Constructor
  public Walker(int x, int y, Image leftPic, Image rightPic)
  {
    leftFoot =  new Foot(x, y - PIXELS_PER_INCH * 4, leftPic);
    rightFoot = new Foot(x, y + PIXELS_PER_INCH * 4, rightPic);
    stepLength = PIXELS_PER_INCH * 12;
    stepsCount = 1;
  }  

  // Returns the left foot
  public Foot getLeftFoot()
  {
    return leftFoot;
  }

  // Returns the right foot
  public Foot getRightFoot()
  {
    return rightFoot;
  }

  // Makes first step, starting with the left foot
  public void firstStep()//methods of Walker.java
  {
    leftFoot.moveForward(stepLength);
  }

  // Makes next step
  public void nextStep()
  {
    if (stepsCount % 2 == 0)  // if stepsCount is even, then move the leftFoot stepLength * 2 else the right foot
      leftFoot.moveForward(2 * stepLength);	
    else  
      rightFoot.moveForward(2 * stepLength);

    stepsCount++;  // increment by 1
  }

  // Stops this walker (brings its feet together)
  public void stop()
  {
    if (stepsCount % 2 == 0)//Instead when I call this method, the leftFoot or rightFoot moves stepLength distance
      leftFoot.moveForward(stepLength);
    else 
      rightFoot.moveForward(stepLength);
    
    stepsCount++;
  }

  // Returns the distance walked
  public int distanceTraveled()
  {
    return stepsCount * stepLength;
  }

  // Draws this walker
  public void draw(Graphics g)
  {
    leftFoot.draw(g);
	rightFoot.draw(g);
  }
}
/*1. Which class is foot a subclass of?
	 Foot is a subclass of WalkerTest
	
  2. Does class Walker encapsulate functionality? If so, what does it encapsulate? 
	 Walker does encapsulate functionality. It encapsulates the methods used to make the walker move forward.*/