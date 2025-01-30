//Author: Rithvik Muthyalapati
//Date: 3/3/19
//Version 2.0
//Version Notes:
//v.2.0: I added this header

/* My epic lipogram starting from here:
 * You should not try to fail the Lipogram as this class talks about marking and printing all words with the ban which is a cool and hard class
 * if you don't obtain a 100%, you didn't study as hard to obtain an A, but you did study to obtain a C for you didn't obtain A class work
 */
public class LipogramAnalyzer {
	String in;

	public LipogramAnalyzer(String in) {
		this.in = in;
	}

	public String mark(char letter) {
		return in.replace(letter, '#');// Replaces all e's with a hash mark
	}

	public String allWordsWith(char letter) {// This method finds words with the letter "e" in it
		in = in.replaceAll("[^a-zA-Z]", " ");// This replaces everything with a space excluding the characters within the brackets
		String[] words = in.split(" ");
		String eWords = "-";
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains("e") || words[i].contains("E")) {
				if (!eWords.contains("-" + words[i] + "-")) {
					eWords += words[i] + "-";
				}
			}
		}
		return eWords.replace("-", "\n").trim() + "\n";
	}
}
