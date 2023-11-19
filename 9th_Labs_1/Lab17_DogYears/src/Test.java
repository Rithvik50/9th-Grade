// DogYears automated tester
// Author: Mr. Taylor
// Date:   Mr. Taylor's birthday 
//
// to use this program:
// 1)  add this source file to the source directory of the DogYears Eclipse Project
// 2)  within eclipse, right click on the project folder and select run as a java
//     application
// 3)  select the DoYearsFinalGradeTester option when asked
// 4)  have fun with the results shown on the console output

// Notes:
// this only tests the convertToHumanYears() and convertToDogYears() methods
// for this to work, your method names for the DogYears class have to match 
// those above. also, your dog years class name should match "DogYears.java"


// automated tester class for the dog years lab
public class Test{
   // the one and only method for this tester class
   public static void main (String[] args) {
       
       // initializing an array of known human year values
       int [] humanYearValue = new int[]  {13, 18, 24, 29, 34, 40, 45,
                                           50, 56, 61, 66, 72, 77, 82,
                                           88, 93, 98};
       // initializing an array of known related dog year values
       int [] dogYearValue = new int[]    {1, 2, 3, 4, 5, 6, 7,
                                           8, 9, 10, 11, 12, 13, 14,
                                           15, 16, 17};
       
       // initializing values for some worker variables 
       int passCount = 0, failCount = 0;
       int expectedValue = 0, returnValue = 0;
       boolean testResult;
       
       // bring life to a DogYears object so we can access it's methods later
       DogYears dogYearTester = new DogYears();
       
       // start the test
       System.out.println("Start test ********");
       
       for (int i = 1; i < humanYearValue.length; i++) // for each element in the list of human years
       {
          returnValue = dogYearTester.convertToHumanYears(i); // get the return value from the convertToHuman() method
          expectedValue = humanYearValue[i-1];  // get the expected value from the array initialized above
          testResult = returnValue == expectedValue; // test if the expected result matches the returned result
          
          System.out.println("Test [" + i + "],  Dog year value is " + i +
                             " so, human year value should be: " + expectedValue);
          
          // if the values match, up the pass count and print a message
          if (testResult)
          {
                passCount++; // increment the number of tests passed
                System.out.println("PASS \tmethod returned: " +
                      returnValue +
                      "\texpected: " +
                      expectedValue);
          }
          // if the values don't match, up the fail count and print a message
          else
          {
                failCount++; // increment the number of tests failed
                System.out.println("FAIL \tmethod returned: " +
                                    returnValue +
                                    "\texpected: " +
                                    expectedValue);
          }
          
          // do the same as above for the convert to dog years method
          returnValue = dogYearTester.convertToDogYears(humanYearValue[i-1]);
          expectedValue = dogYearValue[i-1];
          testResult = returnValue == expectedValue;
          
          System.out.println("Test [" + i + "],  Human year value is " + humanYearValue[i-1] +
                             " so, dog year value should be: " + expectedValue);
          
          if (testResult)
          {
                passCount++;
                System.out.println("PASS \tmethod returned: " +
                      returnValue +
                      "\texpected: " +
                      expectedValue);
          }
          else
          {
                failCount++;
                System.out.println("FAIL \tmethod returned: " +
                                    returnValue +
                                    "\texpected: " +
                                    expectedValue);
          }
       }
       
       // print out a summary message for all to enjoy!
       System.out.println("Fail count: " + failCount + "\t Pass count: " + passCount);
       System.out.println("If Fail count is greater than 0, check your algorithm");
      
   }

}
