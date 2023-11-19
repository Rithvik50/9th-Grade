//Author: Rithvik Muthyalapati
//Date: 2/15/19
//Version 2.0
//Version Notes:
//v.2.0: I added the header and implemented comments

import java.util.Scanner;

public class StarTester {
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		Stars starTester = new Stars();
		
		System.out.println("Select a method you want to test: ");//Physical menu selection for star patterns
		System.out.println("1) printStars");
		System.out.println("2) printStarSquare");
		System.out.println("3) printStarTriangle");
		System.out.println("4) printInvertedStarTriangle");
		System.out.println("5) printStarPyramid");
		System.out.println("6) printStarDiamond");
		System.out.println("7) quit");
		System.out.print("Enter here: ");
		String astrexChoice = kboard.next();
		
		do {//Menu choice actions
			if (astrexChoice.equals("printStars")) {
				System.out.print("Enter the number of stars you want to see --> ");
				int stars = kboard.nextInt();
				starTester.printStars(stars);
				break;
			} else if (astrexChoice.equals("printStarSquare")) {
				System.out.print("Enter the number of stars in each row/number of rows: ");
				int starRows = kboard.nextInt();
				starTester.printStarSquare(starRows);
				break;
			} else if (astrexChoice.equals("printStarTriangle")) {
				System.out.print("Enter the number of rows in the triangle: ");
				int triangleRows = kboard.nextInt();
				starTester.printStarTriangle(triangleRows);
				break;
			} else if (astrexChoice.equals("printInvertedStarTriangle")) {
				System.out.print("Enter the number of rows in the triangle: ");
				int invertedRows = kboard.nextInt();
				starTester.printStarInvertedTriangle(invertedRows);
				break;
			} else if (astrexChoice.equals("printStarPyramid")) {
				System.out.print("Enter the number of rows in the triangle: ");
				int pyramidRows = kboard.nextInt();
				starTester.printStarPyramid(pyramidRows);
				break;
			} else if (astrexChoice.equals("printStarDiamond")) {
				System.out.print("Enter the number of rows in the diamond: ");
				int diamondRows = kboard.nextInt();
				starTester.printStarDiamond(diamondRows);
				break;
			}
			
		} while(!astrexChoice.equals("quit"));
	}

}
