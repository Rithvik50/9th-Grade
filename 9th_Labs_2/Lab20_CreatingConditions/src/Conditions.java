
/*
	This is the ConditionTester template. Use this class to test simple boolean methods!

	Coded by:
	Date:
*/

import java.util.Scanner;

public class Conditions {
	

	// This method tests the parameters in some way, then returns the result of the
	// test
//	public boolean exampleTestMethod(int a, int b) {
//		boolean result;
//		if (a < b) {
//			result = true;
//		} 
//		else if (a != b && a > b) {
//			result = false;
//		}
//		return result;
//	}

	public boolean isPointInRectangle(int x, int y, int xRect, int yRect, int rectWidth, int rectHeight) {
		boolean result;
		if ((x > xRect && x < xRect + rectWidth) && (y > yRect && y < yRect + rectHeight)) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	public boolean isLeapYear(int year) {
		boolean result2;
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			result2 = true;
		} 
		else {
			result2 = false;
		}
		return result2;
	}

	public boolean hasTwoEndingZeroes(int x) {
		boolean result3;
		if (x % 100 == 0 && x % 1000 != 0 && x > 99) {
			result3 = true;
		} else {
			result3 = false;
		}
		return result3;
	}

	  public boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
		  boolean result4;
		  if (year1 == year2) {
			  if (month1 == month2) {
				if (day1 > day2) {
					result4 = true;
				}  
				else {
					result4 = false;
				}
			  }
			  else if (month1 > month2) {
				  result4 = true;
			  }
			  else {
				  result4 = false;
			  }
			 
		  }
	     else if (year1 > year2) {
		    result4 = true;
	     }
	     else {
	        result4 = false;
	     }
	    return result4;
	}
}