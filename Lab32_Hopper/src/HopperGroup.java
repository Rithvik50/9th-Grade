//Author: Rithvik Muthyalapati
//Date: 4/12/19
//Version 2.0
//Version Notes:
//v.2.0: I added this epic header right here

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HopperGroup implements StudentGroup
{
  private Hopper maleDancer;
  private Image leftMansShoe, rightMansShoe;

  private DanceFloor danceFloor;

  private enum State {READY, MOVING, STOPPED}
  private State currentState;

  // Constructor
  public HopperGroup(DanceFloor df)
  {
    danceFloor = df;
    leftMansShoe = (new ImageIcon("leftshoe.gif")).getImage();
    rightMansShoe = (new ImageIcon("rightshoe.gif")).getImage();
  }

  // Sets up this group of participants
  public void setup(int floorDir, Dance steps1, Dance steps2)
  {
    int x = danceFloor.getWidth() / 2;
    int y = danceFloor.getHeight() / 2;
    if (floorDir == 0)
    {
      maleDancer = new Hopper(x, y + Dancer.PIXELS_PER_INCH * 12, leftMansShoe, rightMansShoe);
      maleDancer.turnLeft();
    }
    else
    {
      maleDancer = new Hopper(x, y - Dancer.PIXELS_PER_INCH * 12, leftMansShoe, rightMansShoe);
      maleDancer.turnRight();
    }
    currentState = State.READY;
    danceFloor.update(this);
  }

  // Moves the group by one step
  public void makeNextStep()
  {
    if (currentState == State.READY)
    {
      maleDancer.firstStep();
      currentState = State.MOVING;
    }
    else if (currentState == State.MOVING)
    {
      maleDancer.nextStep();
    }
    else if (currentState == State.STOPPED) // never happens
    {
      maleDancer.turnAround();
      currentState = State.READY;
    }

    danceFloor.update(this);
  }

  // Draws this group
  public void draw(Graphics g)
  {
    maleDancer.draw(g);
  }
}

