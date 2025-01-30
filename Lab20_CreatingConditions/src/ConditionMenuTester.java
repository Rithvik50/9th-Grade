import java.util.Scanner;

public class ConditionMenuTester {


	public static void main(String[] args) {
		Scanner conditionInput = new Scanner(System.in);
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter the number corresponding to the method you want to test --> ");
		int conditionSelector = conditionInput.nextInt();

		// Copy-Paste more of these lines if more input is necessary
//		System.out.print("Enter the first number --> ");
//		int num1 = kboard.nextInt();
//		System.out.print("Enter the second number --> ");
//		int num2 = kboard.nextInt();
//		ConditionTester tester = new ConditionTester();
//		boolean result = tester.exampleTestMethod(num1, num2);
//		System.out.println("The result of the test: " + result);
		switch (conditionSelector) {
		case 1: 
			System.out.print("Enter the x coordinate --> ");
			int xCord = kboard.nextInt();
			System.out.print("Enter the y coordinate --> ");
			int yCord = kboard.nextInt();
			Conditions tester = new Conditions();
			boolean result = tester.isPointInRectangle(xCord, yCord, 50, 50, 100, 100);
			System.out.println("The result of the test: " + result);
			break;

		case 2: 
			System.out.print("Enter a year --> ");
			int year = kboard.nextInt();
			Conditions tester2 = new Conditions();
			boolean result2 = tester2.isLeapYear(year);
			System.out.println("The result of the test: " + result2);
			break;

		case 3:
			System.out.print("Enter a number --> ");
			int x = kboard.nextInt();
			Conditions tester3 = new Conditions();
			boolean result3 = tester3.hasTwoEndingZeroes(x);
			System.out.println("The result of the test: " + result3);
			break;

		case 4: 
			System.out.print("Enter the first month --> ");
			int month1 = kboard.nextInt();
			System.out.print("Enter the first day --> ");
			int day1 = kboard.nextInt();
			System.out.print("Enter the first year --> ");
			int year1 = kboard.nextInt();
			System.out.print("Enter the second month --> ");
			int month2 = kboard.nextInt();
			System.out.print("Enter the second day --> ");
			int day2 = kboard.nextInt();
			System.out.print("Enter the second year --> ");
			int year2 = kboard.nextInt();
			Conditions tester4 = new Conditions();
			boolean result4 = tester4.isLater(month1, day1, year1, month2, day2, year2);
			System.out.println("The result of the test: " + result4);
			break;
			
		default: 
			System.out.println("Please enter an integer from 1 to 4.");
		
	  }
	}

}
