//Author: Rithvik Muthyalapati
//Date: 3/19/19
//Version 2.0
//Version Notes:
//v.2.0: I made it so that if the minutes had a single digit, it would be trailing behind a zero like 4:03

public class TimeTester {

	public static void main(String[] args) {
		Time t1 = new Time(22, 45);
		Time t2 = new Time(8, 45);
		Time t3 = new Time(4, 0);
		Time t4 = new Time(1, 59);
		Time t5 = new Time("Current time");
		Time t6 = new Time(859);
		
		System.out.println("Time 1: " + t1);
		System.out.println("Time 2: " + t2);
		System.out.println("Time 3: " + t3);
		System.out.println("Time 4: " + t4);
		System.out.println("Time 5: " + t5);
		System.out.println("Time 6: " + t6);
		System.out.println();
		System.out.println(t1.toMins());
		System.out.println(t1.compareTo(t2));
		System.out.println(t1.elapsedSince(t2));
		System.out.println(t1.increment());
		System.out.println();
		System.out.println(t2.timeZone("IST"));
	}
	
}
