//Author: Rithvik Muthyalapati
//Date: 4/12/19
//Version 2.0
//Version Notes:
//v.2.0: I added this epic header right here


// Represents a Biped that moves the left foot to the left and the right foot to the right

import java.awt.Image;

public class Splitter extends Biped
{
  private int stepLength;
  private int stepsCount;
  
  // Constructor
  public Splitter(int x, int y, Image leftPic, Image rightPic)
  {
    super(x, y, leftPic, rightPic);  // must be the first statement
    stepLength = PIXELS_PER_INCH * 12;
  }  

  // Makes first step, starting with the left foot
  public void firstStep()
  {
	getLeftFoot().turn(-90);
	getRightFoot().turn(90);
    getLeftFoot().moveForward(stepLength);
    getRightFoot().moveForward(stepLength);
    stepsCount = 1;
  }

  // Makes next step
  public void nextStep()
  {
	  if (stepsCount % 2 == 0) {
		  getLeftFoot().turn(-90);
		  getRightFoot().turn(90);
	  } else {
		  getLeftFoot().turn(90);
		  getRightFoot().turn(-90);
	  }
      getLeftFoot().moveForward(stepLength);
      getRightFoot().moveForward(stepLength);
      
    stepsCount++;
  }

  // Stops this walker (brings its feet together)
  public void stop()
  {
    if (stepsCount % 2 == 0)  // if stepsCount is even
      getLeftFoot().moveForward(stepLength);
      getRightFoot().moveForward(stepLength);
  }

  // Returns the distance walked
  public int distanceTraveled()
  {
    return stepsCount * stepLength;
  }
}
