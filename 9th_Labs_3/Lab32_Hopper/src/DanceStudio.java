//Author: Rithvik Muthyalapati
//Date: 4/12/19
//Version 2.0
//Version Notes:
//v.2.0: I added this epic header right here

public class DanceStudio
{
  public static void main(String[] args)
  {
    DanceFloor danceFloor = new DanceFloor();
    StudentGroup students = new DanceGroup(danceFloor);
    new DanceLesson(students, danceFloor);
  }
}
