//Author: Rithvik Muthyalapati
//Date: 3/3/19
//Version 2.0
//Version Notes:
//v.2.0: I created a subtract and divide methods that takes in both object or integer

// Represents a fraction with an int numerator and int denominator
// and provides methods for adding and multiplying fractions.

public class Fraction {
	// *** instance variables ***
	private int num;
	private int denom;

	// *** Constructors ***

	public Fraction() // no-args constructor
	{
		num = 0;
		denom = 1;
	}

	public Fraction(int n) {// Parameter is the numerator over 1
		num = n;
		denom = 1;
	}

	public Fraction(int n, int d) {// Takes numerator and denominator and forms a fraction
		if (d != 0) {
			num = n;
			denom = d;
			reduce();
		} else {
			throw new IllegalArgumentException("Fraction construction error: denominator is 0");
		}
	}

	public Fraction(Fraction other) // copy constructor
	{
		num = other.num;
		denom = other.denom;
	}

	public Fraction(double x) {// Takes the decimal and converts into fraction
		String stringForm = x + "";// Converted into string
		String whole = stringForm.substring(0, stringForm.indexOf("."));// Digits before decimal
		String mantissa = stringForm.substring(stringForm.indexOf(".") + 1);// Digits after decimal
		if (mantissa.length() >= 3 && mantissa.replace(mantissa.substring(0, 1), "").isEmpty()) {// Checks if x is a
																									// repeating decimal
			String thousandths = mantissa.substring(0, 3);// Takes digits to the thousandths place
			int oldWhole = Integer.parseInt(whole);// Original whole value
			num = Integer.parseInt(whole + thousandths) - oldWhole;// Subtract old from new because of the pdf on
																	// schoolloop and system of equations
			denom = (int) Math.pow(10, 3) - 1;
			reduce();
		} else {
			int digitNum = mantissa.length();// Number of digits after decimal
			num = Integer.parseInt(whole + mantissa);// parseInt converts from string back into int
			denom = (int) Math.pow(10, digitNum);// Math.pow is the power of method where first parameter is the base
													// and second is the exponent
			reduce();
		}
	}

	// *** public methods ***

	// Returns the sum of this fraction and other
	public Fraction add(Fraction other) {
		int newNum = num * other.denom + denom * other.num;
		int newDenom = denom * other.denom;
		return new Fraction(newNum, newDenom);
	}

	// Returns the sum of this fraction and m
	public Fraction add(int m) {
		return new Fraction(num + m * denom, denom);
	}

	// Returns the difference of this fraction and f
	public Fraction subtract(Fraction f) {
		int newNum = num * f.denom - denom * f.num;
		int newDenom = denom * f.denom;
		return new Fraction(newNum, newDenom);
	}

	// Returns the difference of this fraction and m
	public Fraction subtract(int m) {
		return new Fraction(num - m * denom, denom);
	}

	// Returns the product of this fraction and other
	public Fraction multiply(Fraction other) {
		int newNum = num * other.num;
		int newDenom = denom * other.denom;
		return new Fraction(newNum, newDenom);
	}

	// Returns the product of this fraction and m
	public Fraction multiply(int m) {
		return new Fraction(num * m, denom);
	}

	// Returns the quotient of this fraction and f
	public Fraction divide(Fraction f) {
		int newNum = num * f.denom;
		int newDenom = denom * f.num;
		if (newDenom == 0) {
			throw new IllegalArgumentException("Fraction construction error: denominator is 0 and that is really bad");
		}
		return new Fraction(newNum, newDenom);
	}

	// Returns the quotient of this fraction and m
	public Fraction divide(int m) {
		if (m == 0) {
			throw new IllegalArgumentException("Fraction construction error: parameter is 0 and that is really bad");
		}
		return new Fraction(num, denom * m);
	}
	
	// Returns the inverse of this fraction
	public Fraction inverse() {
		return new Fraction(denom, num);
	}
	
	// Returns the power of the numerator and denominator
	public Fraction power(int n) {
		int newNum = (int)Math.pow(num, n);
		int newDenom = (int)Math.pow(denom, n);
		return new Fraction(newNum, newDenom);
	}

	// Returns the value of this fraction as a double
	public double getValue() {
		return (double) num / (double) denom;
	}

	// Returns a string representation of this fraction
	public String toString() {
		return num + "/" + denom;
	}
	

	// *** private methods ***

	// Reduces this fraction by the gcf and makes denom > 0
	private void reduce() {
		if (num == 0) {
			denom = 1;
			return;
		}

		if (denom < 0) {
			num = -num;
			denom = -denom;
		}

		int q = gcf(Math.abs(num), denom);
		num /= q;
		denom /= q;
	}

	// Returns the greatest common factor of two positive integers
	private int gcf(int n, int d) {
		if (n <= 0 || d <= 0) {
			throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);
		}

		if (n % d == 0)
			return d;
		else if (d % n == 0)
			return n;
		else
			return gcf(n % d, d % n);
	}
}
