//Author: Rithvik Muthyalapati
//Date: 3/3/19
//Version 2.0
//Version Notes:
//v.2.0: I created a subtract and divide methods that takes in both object or integer

public class TestFractions {
	public static void testConstructors() {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(7);
		Fraction f3 = new Fraction(12, -20);
		Fraction f4 = new Fraction(f3);
		Fraction f5 = new Fraction(7.7777);

		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		System.out.println("f3 = " + f3);
		System.out.println("f4 = " + f4);
		System.out.println("f5 = " + f5);
		System.out.println();
	}

	public static void testArithmetic() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 1);

		Fraction sum = f1.add(f2);
		System.out.println("1). f1.add(f2): " + f1 + " + " + f2 + " = " + sum);
		System.out.println();

		Fraction difference = f1.subtract(f2);
		System.out.println("2). f1.subtract(f2): " + f1 + " - " + f2 + " = " + difference);

		Fraction oneDifference = f1.subtract(5);
		System.out.println("3). f1.subtract(5): " + f1 + " - " + 5 + " = " + oneDifference);
		System.out.println();

		Fraction product = f1.multiply(f2);
		System.out.println("4). f1.multiply(f2): " + f1 + " * " + f2 + " = " + product);
		System.out.println();

		Fraction quotient = f1.divide(f2);
		System.out.println("5). f1.divide(f2): " + f1 + " / " + f2 + " = " + quotient);

		Fraction oneQuotient = f1.divide(5);
		System.out.println("6). f1.divide(5): " + f1 + " / " + 5 + " = " + oneQuotient);

		System.out.println();
	}

	public static void testValues() {
		Fraction f = new Fraction(2, 3);
		System.out.println(f + " = " + f.getValue());
		System.out.println();
	}
	
	public static void testChoice() {
		Fraction f = new Fraction(2, 3);
		
		Fraction in = f.inverse();
		System.out.println(f + " inversed = " + in);
		
		Fraction pow = f.power(2);
		System.out.println(f + " ^ 2 = " + pow);
	}

	public static void main(String[] args) {
		testConstructors();
		testArithmetic();
		testValues();
		testChoice();
	}
}
