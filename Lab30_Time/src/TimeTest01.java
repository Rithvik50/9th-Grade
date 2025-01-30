/*

****Correct TimeTest output****

Testing Constructors:

An exception was thrown by 5:60. Message: ???
An exception was thrown by 1:-30. Message: ???
Time t1 = 0:00
Time t2 = 13:05
Time t3 = 0:00

Testing Methods:

0:00 in minutes is 0
20:45 in minutes is 1245
0:00 compared to 20:45? -1
20:45 compared to 0:00? 1
13:00 compared to 8:30? 1
20:45 compared to 20:45? 0
780 minutes have gone between 0:00 and 13:00
735 minutes have gone between 8:30 and 20:45
705 minutes have gone between 20:45 and 8:30
Increment test 1: 20:46
Increment test 2: 12:00
Increment test 3: 0:00

Testing Choice:

AM or PM: 8:30
AM or PM: 19:30


*/

public class TimeTest01 {

	public static void testConstructors() {
		System.out.println("\nTesting Constructors:\n");

		Time t1 = new Time();
		Time t2 = new Time(13,5);
		Time t3 = new Time(0,0);

		try {
			Time t4 = new Time(5,60);
			System.out.println("Time t4 = " + t4);
		} catch(IllegalArgumentException e) {
			System.out.println("An exception was thrown by 5:60. Message: " + e.getMessage());
		}
		try {
			Time t5 = new Time(1,-30);
			System.out.println("Time t5 = " + t5);
		} catch(IllegalArgumentException e) {
			System.out.println("An exception was thrown by 1:-30. Message: " + e.getMessage());
		}


		System.out.println("Time t1 = " + t1);
		System.out.println("Time t2 = " + t2);
		System.out.println("Time t3 = " + t3);
	}



	public static void testMethods() {
		System.out.println("\nTesting Methods:\n");

		Time t1 = new Time();
		Time t2 = new Time(8,30);
		Time t3 = new Time(13,0);
		Time t4 = new Time(20,45);

		System.out.println(t1 + " in minutes is " + t1.toMins());
		System.out.println(t4 + " in minutes is " + t4.toMins());
		System.out.println(t1 + " compared to " + t4 + "? " + t1.compareTo(t4));
		System.out.println(t4 + " compared to " + t1 + "? " + t4.compareTo(t1));
		System.out.println(t3 + " compared to " + t2 + "? " + t3.compareTo(t2));
		System.out.println(t4 + " compared to " + t4 + "? " + t4.compareTo(t4));
		System.out.println(t3.elapsedSince(t1) + " minutes have gone between " + t1 + " and " + t3);
		System.out.println(t4.elapsedSince(t2) + " minutes have gone between " + t2 + " and " + t4);
		System.out.println(t2.elapsedSince(t4) + " minutes have gone between " + t4 + " and " + t2);

		Time t5 = new Time(11,59);
		Time t6 = new Time(23,59);

		t4.increment();
		t5.increment();
		t6.increment();

		// For an immutable class, use these instead
		t4 = t4.increment();
		t5 = t5.increment();
		t6 = t6.increment();

		System.out.println("Increment test 1: " + t4);
		System.out.println("Increment test 2: " + t5);
		System.out.println("Increment test 3: " + t6);

	}
	
	public static void testChoice() {
		System.out.println("\nTesting Choice:\n");

		Time t1 = new Time(8, 30, true);
		Time t2 = new Time(7, 30, false);
		Time t3 = new Time("Current time");
		Time t4 = new Time(8, 30);
		
		System.out.println("AM or PM: " + t1);
		System.out.println("AM or PM: " + t2);
		System.out.println("Current Time is: " + t3);
		System.out.println("Total Minutes: " + t4.toMins());
		System.out.println("Time Zone Conversion: " + t4.timeZone("America/New_York"));
	}

	public static void main(String[] args) {
		testConstructors();
		testMethods();
		testChoice();
	}

}











