//Author: Rithvik Muthyalapati
//Date: 4/12/19
//Version 2.0
//Version Notes:
//v.2.0: I added this epic header right here


// Represents a Biped that hops and lands on both feet in random directions

import java.awt.Image;
import java.util.Random;

public class RandomHopper extends Hopper
{
  private int stepLength;
  private int stepsCount;
    
  // Constructor
  public RandomHopper(int x, int y, Image leftPic, Image rightPic)
  {
    super(x, y, leftPic, rightPic);  // must be the first statement
    stepLength = PIXELS_PER_INCH * 12;
  }  

  // Makes first step, starting with the left foot
  public void firstStep()
  {
    getLeftFoot().moveForward(stepLength);
    getRightFoot().moveForward(stepLength);
    stepsCount = 1;
  }

  // Makes next step
  public void nextStep()
  {    
	Random rand = new Random();
    int randNum = rand.nextInt(4);
    
    if (randNum == 1) {
    	getLeftFoot().turn(-90);
    	getRightFoot().turn(-90);
    	getRightFoot().moveSideways(PIXELS_PER_INCH * 8);
    	getRightFoot().moveForward(PIXELS_PER_INCH * 8);
    	getLeftFoot().moveForward(stepLength);
        getRightFoot().moveForward(stepLength);
        stepsCount++;
    } else if (randNum == 2) {
    	getLeftFoot().turn(90);
    	getRightFoot().turn(90);
    	getLeftFoot().moveSideways(-PIXELS_PER_INCH * 8);
    	getLeftFoot().moveForward(PIXELS_PER_INCH * 8);
    	getLeftFoot().moveForward(stepLength);
        getRightFoot().moveForward(stepLength);
        stepsCount++;
    } else if (randNum == 3) {
    	getLeftFoot().turn(180);
    	getRightFoot().turn(180);
    	getLeftFoot().moveSideways(-PIXELS_PER_INCH * 8);
    	getRightFoot().moveSideways(PIXELS_PER_INCH * 8);
    	getLeftFoot().moveForward(stepLength);
        getRightFoot().moveForward(stepLength);
        stepsCount++;
    } else {
    	getLeftFoot().moveForward(stepLength);
        getRightFoot().moveForward(stepLength);
        stepsCount++;
    }
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


