import java.util.Scanner;
public class UserInput {
//This program displays a user input interface where you type a number and it prints double the number//
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner keyboard = new Scanner (System.in);
		int n = keyboard.nextInt();
		System.out.println("2 * " + n + " = " + (n + n));

	}
//I used the keyboard utility to create a user interface//
}
