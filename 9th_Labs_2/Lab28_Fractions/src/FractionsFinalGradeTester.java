// (DRAFT)
// Modified code adopted from Daniel DeAnda, Period 5, 03/13/2018
// 

// FractionsFinalGradeTester.java class tests Fraction.java class
// Add this class to Fraction project and run for test results

// This tester assumes the following:
// 1) The getValue method is unaltered
// 2) Only 2-digit and 1-digit ratios can be expected to be accurate
// 3) Choice methods will be evaluated on a per-person, in-person basis

public class FractionsFinalGradeTester {
	
	// Compares two doubles and tells if they are equal to the ten-thousandths place
	private static boolean checkDoubleEquality(double a, double b) {
		double epsilon = 0.0001; // within one ten-thousandth (up to 2-digit ratios)
		if (Math.abs(a-b) < epsilon) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		// SCORE VARIABLES
	    int testCount = 0;
	    int failCount = 0;
	    double percentPass = 0;
	    //double earnedPoints = 0;
	      
		// TESTER VALUES
		final double D1 = 1.0/4.0;
		final Fraction F1 = new Fraction(D1);
		
		final double D2 = 2.0/3.0;
		final Fraction F2 = new Fraction(D2);
		
		final double D3 = 0.0;
		final Fraction F3 = new Fraction(D3);
		
		final double D4 = 5.0/12.0;
		final double D5 = -1.0/3.0;
		final double D6 = 8.0/3.0;
		final double D7 = 2.0/6.0;
		final Fraction F4 = new Fraction(2, 3);
		final Fraction F5 = new Fraction(1, 4);
		
		// TOTAL POINTS
	    //final int TOTALPOINTS = 10;
	    
	    // TESTER OUTPUT HEADER
	    System.out.println("------Fraction.java TESTER------");
	    System.out.println();
	    
	    // DOES THE DOUBLE CONSTRUCTOR WORK WITH 1/B FRACTIONS?
	    testCount++;
	    System.out.println("Double Constructor 1/B Check");
	    System.out.println(D1 + " = " + F1.toString());
	    if (!checkDoubleEquality(D1, F1.getValue())) {
	    	failCount++;
	    	System.out.println("FAIL");
	    } else {
	    	System.out.println("PASS");
	    }
	    System.out.println();
	    
	    // DOES THE DOUBLE CONSTRUCTOR WORK WITH A/B FRACTIONS?
	    testCount++;
	    System.out.println("Double Constructor A/B Check");
	    System.out.println(D2 + " = " + F2.toString());
	    if (!checkDoubleEquality(D2, F2.getValue())) {
	    	failCount++;
	    	System.out.println("FAIL");
	    } else {
	    	System.out.println("PASS");
	    }
	    System.out.println();
	    
	    // CAN THE DOUBLE CONSTRUCTOR HANDLE THE ZERO CASE?
	    testCount++;
	    System.out.println("Double Constructor Zero Check");
	    System.out.println(D3 + " = " + F3.toString());
	    if (!checkDoubleEquality(D3, F3.getValue())) {
	    	failCount++;
	    	System.out.println("FAIL");
	    } else {
	    	System.out.println("PASS");
	    }
	    System.out.println();
	    
	    // DOES SUBTRACTION BY FRACTION WORK?
	    testCount++;
	    System.out.println("Subtraction by Fraction Check");
	    Fraction answer4 = F4.subtract(F5);
	    System.out.println(F4.toString() + " - " + F5.toString() + " = " + answer4);
	    if (!checkDoubleEquality(D4, answer4.getValue())) {
	    	failCount++;
	    	System.out.println("FAIL");
	    } else {
	    	System.out.println("PASS");
	    }
	    System.out.println();
	    
	    // DOES SUBTRACTION BY INTEGER WORK?
	    testCount++;
	    System.out.println("Subtraction by Integer Check");
	    Fraction answer5 = F4.subtract(1);
	    System.out.println(F4.toString() + " - 1 = " + answer5);
	    if (!checkDoubleEquality(D5, answer5.getValue())) {
	    	failCount++;
	    	System.out.println("FAIL");
	    } else {
	    	System.out.println("PASS");
	    }
	    System.out.println();
	    
	    // DOES DIVISION BY FRACTION WORK?
	    testCount++;
	    System.out.println("Division by Fraction Check");
	    Fraction answer6 = F4.divide(F5);
	    System.out.println(F4.toString() + " / " + F5.toString() + " = " + answer4);
	    if (!checkDoubleEquality(D6, answer6.getValue())) {
	    	failCount++;
	    	System.out.println("FAIL");
	    } else {
	    	System.out.println("PASS");
	    }
	    System.out.println();
	    
	    // DOES DIVISION BY INTEGER WORK?
	    testCount++;
	    System.out.println("Division by Integer Check");
	    Fraction answer7 = F4.divide(2);
	    System.out.println(F4.toString() + " / 2 = " + answer7);
	    if (!checkDoubleEquality(D7, answer7.getValue())) {
	    	failCount++;
	    	System.out.println("FAIL");
	    } else {
	    	System.out.println("PASS");
	    }
	    System.out.println();
	    
	    // PRINT TEST SUMMARY
	    
	    System.out.println();
	    System.out.println("*****   TEST SUMMARY     *****");
	    System.out.println("Tests:          " + testCount);
	    System.out.println("Failed:         " + failCount);
	
	 	
	    percentPass = (double) (testCount - failCount) / testCount * 100;
	    //earnedPoints = percentPass * TOTALPOINTS / 100;
	    System.out.println("Percent passed: " + Math.round(percentPass) + "%");
	 	// System.out.println("Points earned:  " + Math.round(earnedPoints));
	    
	}
}
