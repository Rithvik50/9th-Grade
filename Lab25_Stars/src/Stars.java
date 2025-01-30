
public class Stars {

	public void printStars(int x) {//Prints out a row of stars
		for (int i = 0; i < x; i++) {
			System.out.print("*");
		}
	}
	
	public void printStarSquare(int n) {//Prints out a square of stars
		for (int row = 1; row <= n; row++) {
			for (int numStars = 1; numStars <= n; numStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printStarTriangle(int n) {//Prints out a triangle of stars
		int maxCount = 1;
		for (int row = 1; row <= n; row++) {
			for (int numStars = 1; numStars <= maxCount; numStars++) {
				System.out.print("*");
			}
			maxCount++;
			System.out.println();
		}
	}
	
	public void printStarInvertedTriangle(int n) {//Prints inverted star triangle
		for(int i = 0; i < n; i++) {
			for(int spaces = 0; spaces < n - i; spaces++) {
				System.out.print(" ");
			}
			for(int numStars = 0; numStars <= i; numStars++) {
				System.out.print("*");
			}
			System.out.println();  
		}
	}
	
	public void printStarPyramid(int n) {//Prints a star pyramid
		int starCounter = 1;
		for(int i = 0; i < n; i++) {
			for(int spaces = 0; spaces < n - i; spaces++) {
				System.out.print(" ");
			}
			for(int starsNum = 1; starsNum <= starCounter; starsNum++){
				System.out.print("*");
			}
			starCounter += 2;
			System.out.println();  
		}
	}
	
	public void printStarDiamond(int n) {//Prints a star diamond
		if (n % 2 != 0) {
			n++;
			n /= 2;
			if (n > 0) {
				for (int i = 1; i < n + 1; i++) {
					for (int j = 0; j < n - i; j++)
						System.out.print(" ");
					for (int k = 0; k < 2 * i - 1; k++)
						System.out.print("*");
					System.out.println("");
				}
				for (int i = n - 1; i > 0; i--) {
					for (int j = n - i; j > 0; j--)
						System.out.print(" ");
					for (int k = 2 * i - 1; k > 0; k--)
						System.out.print("*");
					System.out.println("");
				}
			}
		} else if (n % 2 == 0) {
			n /= 2;
			if (n > 0) {
				for (int i = 1; i < n + 1; i++) {
					for (int j = 0; j < n - i; j++)
						System.out.print(" ");
					for (int k = 0; k < 2 * i - 1; k++)
						System.out.print("*");
					System.out.println("");
				}
				for (int i = n; i > 0; i--) {
					for (int j = n - i; j > 0; j--)
						System.out.print(" ");
					for (int k = 2 * i - 1; k > 0; k--)
						System.out.print("*");
					System.out.println("");
				}
			}
		}
	}
}
