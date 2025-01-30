/*
*
*	This simple class prints out a message to the screen welcoming the user.
*
*	Example:
*	Welcome to my program, intelligent and attractive user!
*
*
*/

public class WelcomeTester {

	public static void main(String[] args) {

		WelcomeMessage m1 = new WelcomeEnglish();
		WelcomeMessage m2 = new WelcomeSpanish();
		WelcomeMessage m3 = new WelcomeFrench();
		WelcomeMessage m4 = new WelcomeHindi();
		// ADD CODE TO CREATE YOUR OTHER WELCOME MESSAGES!

		printWelcomeMessage(m1);
		printWelcomeMessage(m2);
		printWelcomeMessage(m3);
		printWelcomeMessage(m4);
		// ADD CODE TO PRINT YOUR WELCOME MESSAGES!

	}

	public static void printWelcomeMessage(WelcomeMessage msg) {
		System.out.println(msg.getWelcomeMessage());
	}

}
