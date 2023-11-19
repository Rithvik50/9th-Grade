//Author: Rithvik Muthyalapati
//Date: 3/3/19
//Version 2.0
//Version Notes:
//v.2.0: I added this header
public class StringToolBox {

	public static String nameEcho(String s) {// Returns first name and last name with all caps
		int spaceIndex = 0;

		String firstWord = "";
		String lastWord = "";
		spaceIndex = s.indexOf(" ");

		firstWord = s.substring(0, spaceIndex);
		lastWord = s.substring(spaceIndex + 1);

		lastWord = lastWord.toUpperCase();

		return firstWord + " " + lastWord;
	}

	public static boolean endsWithStar(String s) {// Checks if string ends with a *
		if (s.isEmpty()) {
			return false;
		} else {
			if (s.endsWith("*")) {
				return true;
			}
		}
		return false;
	}

	public static boolean endsWithTwoStars(String s) {// Checks if string ends with two *'s
		if (s.isEmpty()) {
			return false;
		} else {
			if (s.endsWith("**")) {
				return true;
			}
		}
		return false;
	}

	public static String last4(String s) {// Returns the last four digits in the string
		return s.substring(s.length() - 4);
	}

	public static String last5(String s) {// Returns the last five digits in the string
		return s.substring(s.length() - 6).replace(" ", "");
	}

	public static String scroll(String s) {// First character gets put at the back of the string
		String firstIndex = s.substring(0, 1);
		String scrollString = s.substring(1);
		return scrollString + firstIndex;
	}

	public static String convertName(String s) {// Returns first name with last name
		String lastName = s.substring(0, s.indexOf(","));
		String firstName = s.substring(s.indexOf(" ") + 1);
		return firstName + " " + lastName;
	}

	public static String removeDashes(String s) {// Removes all dashes
		return s.replace("-", "");
	}

	public static String dateStr(String s) {// Returns day-month-year format
		String month = s.substring(0, s.indexOf("/"));
		String day = s.substring(s.indexOf("/") + 1, s.lastIndexOf("/"));
		String year = s.substring(s.lastIndexOf("/") + 1);
		if (month.length() < 2) {
			month = "0" + month;
		}
		if (day.length() < 2) {
			day = "0" + day;
		}
		return day + "-" + month + "-" + year;
	}

	public static String negativeBits(String s) {// Return negative version of specified binary number
		return s.replace("1", "2").replace("0", "1").replace("2", "0").trim();
	}

	public static boolean containsSameChar(String s) {// Checks if whole string contains same character
		String firstLetter = s.substring(0, 1);
		String emptyString = s.replace(firstLetter, "");
		return emptyString.isEmpty();
	}

	public static String removeComments(String s) {// Removes all the comments in the string
		int commentIndex = s.indexOf("/*");
		int commentIndex2 = s.indexOf("*/");
		while (commentIndex != -1) {
			String comment = s.substring(commentIndex, commentIndex2 + 2);
			s = s.replace(comment, "");
			commentIndex = s.indexOf("/*");
			commentIndex2 = s.indexOf("*/");
		}
		return s;
	}

	public static String caesar(String s, int n) {// Simulates a caesar's cipher
		String alph = "abcdefghijklmnopqrstuvwxyz";
		String capAlph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String convertedString = "";
		String convertedLetter = "";
		int charPos2 = 0;
		// Goes through every letter and converts it
		for (int charPos = 0; charPos < s.length(); charPos++) {
			char letter = s.charAt(charPos);
			// Checks if the char is a letter
			if (Character.isLetter(letter)) {
				if (Character.isLowerCase(letter)) {
					int letterAt = alph.indexOf(letter) + n;
					// Turns indexes over length of alph to the front of alph
					if (letterAt >= alph.length()) {
						letterAt = letterAt - alph.length();
					}
					convertedLetter = alph.substring(letterAt, letterAt + 1);
					charPos2++;
					convertedString = convertedString + convertedLetter;
				} else if (Character.isUpperCase(letter)) {
					// Uses Upper Case alphabet
					int letterAt = capAlph.indexOf(letter) + n;
					// Turns indexes over length of capAlph to the front of capAlph
					if (letterAt >= capAlph.length()) {
						letterAt = letterAt - capAlph.length();
					}
					convertedLetter = capAlph.substring(letterAt, letterAt + 1);
					charPos2++;
					convertedString = convertedString + convertedLetter;
				}
			} else {
				convertedString = convertedString + letter;
			}
		}
		return convertedString;
	}

	public static boolean isPalindrome(String s) {// Checks if specified string is a palindrome
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				newString += s.charAt(i);
			}
		}
		s = newString.toLowerCase();
		String reverse = "";

		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}

		if (s.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validPassword(String s) {// Checks if string is a proper password
		boolean hasDigit = false;
		boolean hasUpperChar = false;
		boolean hasLowerChar = false;

		if (s.length() < 7) {
			return false;
		} else {
			String newString = "";
			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetterOrDigit(s.charAt(i))) {
					newString += s.charAt(i);
				}
			}
			s = newString;
			char c;
			for (int i = 0; i < s.length() - 1; i++) {
				c = s.charAt(i);
				if (!Character.isLetterOrDigit(c)) {
					return false;
				} else if (Character.isDigit(c)) {
					hasDigit = true;
				} else if (Character.isLowerCase(c)) {
					hasLowerChar = true;
				} else if (Character.isUpperCase(c)) {
					hasUpperChar = true;
				}
			}
		}
		return hasDigit && hasLowerChar && hasUpperChar;
	}

}