

/*

 Author: Ed Taylor
 Date:   03/04/2018
 
 Final tester for LipogramAnalyzer Lab

*/


public class LipogramFinalGradeTester {
	
	private static int testCount = 0;
    private static int failCount = 0;
    private static double percentPass = 0;
    private static double earnedPoints = 0;
    private static String temp = "";
    
    // points
    private static final int TOTALPOINTS = 10;
    
    // test samples with results
    // test 01
    private static final String TESTSAMPLE01 = "How does your lipogrammer handle this String?";
    private static final String MARKEDRESULT01 = "how do#s your lipogramm#r handl# this string?";		
    private static final String WORDLISTRESULT01 = "does\nlipogrammer\nhandle";
    
    // test samples with results
    // test 02
    private static final String TESTSAMPLE02 = "Currently the first and last words in the String "
    		+ "contain the banned letter";	
    private static final String MARKEDRESULT02 = "curr#ntly th# first and last words in th# string "
    		+ "contain th# bann#d l#tt#r";
    private static final String WORDLISTRESULT02 = "currently\n" + 
    		"the\n" + 
    		"banned\n" + 
    		"letter";
    
    // test samples with results
    // test 03
    private static final String TESTSAMPLE03 = "How does your lipogrammer seek letters? This "
    		+ "version has a few repeated words (and a few words with more than one banned letter too)";
    private static final String MARKEDRESULT03 = "how do#s your lipogramm#r s##k l#tt#rs? "
    		+ "this v#rsion has a f#w r#p#at#d words (and a f#w words with mor# than on# bann#d "
    		+ "l#tt#r too)";
    private static final String WORDLISTRESULT03 = "does\n" + 
    		"lipogrammer\n" + 
    		"seek\n" + 
    		"letters\n" + 
    		"version\n" + 
    		"few\n" + 
    		"repeated\n" + 
    		"more\n" + 
    		"one\n" + 
    		"banned\n" + 
    		"letter";
    
    // test samples with results
    // test 04
    private static final String TESTSAMPLE04 = "Technically, your LipogramAnalyzer should work"
    		+ " even if there are repeated words that contain the banned letter, or possibly even"
    		+ " punctuation!\r\n" + 
    		"\r\n" + 
    		"Check to see if the punctuation is attached to the words, or if new line characters "
    		+ "or tabs mess up your output.\r\n" + 
    		"\r\n" + 
    		"	Using the Character wrapper class to analyze chars is important to extracting words "
    		+ "with the letter \"e\".";
    private static final String MARKEDRESULT04 = "t#chnically, your lipogramanalyz#r should work "
    		+ "#v#n if th#r# ar# r#p#at#d words that contain th# bann#d l#tt#r, or possibly #v#n "
    		+ "punctuation!\r\n" + 
    		"\r\n" + 
    		"ch#ck to s## if th# punctuation is attach#d to th# words, or if n#w lin# charact#rs "
    		+ "or tabs m#ss up your output.\r\n" + 
    		"\r\n" + 
    		"	using th# charact#r wrapp#r class to analyz# chars is important to #xtracting words "
    		+ "with th# l#tt#r \"#\".";
    private static final String WORDLISTRESULT04 = "technically\n" + 
    		"lipogramanalyzer\n" + 
    		"even\n" + 
    		"there\n" + 
    		"are\n" + 
    		"repeated\n" + 
    		"the\n" + 
    		"banned\n" + 
    		"letter\n" + 
    		"check\n" + 
    		"see\n" + 
    		"attached\n" + 
    		"new\n" + 
    		"line\n" + 
    		"characters\n" + 
    		"mess\n" + 
    		"character\n" + 
    		"wrapper\n" + 
    		"analyze\n" + 
    		"extracting\n" + 
    		"e"; 
    
    // offending letter
    private static final char OFFENDINGLETTER = 'e';
    
    
    // test samples with results
    // test 05
    private static final String TESTSAMPLE05 = 
    		"Technically, your LipogramAnalyzer should work even if there are "
    		+ "repeated words that contain the banned letter, or possibly even punctuation!";
    private static final String MARKEDRESULT05 = "t#chnically, your lipogramanalyz#r should "
    		+ "work #v#n if th#r# ar# r#p#at#d words that contain th# bann#d l#tt#r, or "
    		+ "possibly #v#n punctuation!";		
    private static final String WORDLISTRESULT05 = "technically\n" + 
    		"lipogramanalyzer\n" + 
    		"even\n" + 
    		"there\n" + 
    		"are\n" + 
    		"repeated\n" + 
    		"the\n" + 
    		"banned\n" + 
    		"letter";
    		
    

	public static void main(String[] args) {
	
		//test 01
		
		System.out.println("*** NEW TEST STRING ***");
		System.out.println("Test String: " + TESTSAMPLE01);
		
		LipogramAnalyzer analyzer01 = new LipogramAnalyzer (TESTSAMPLE01.toLowerCase());
		
		testCount ++;
		System.out.println(MARKEDRESULT01 + " = " + analyzer01.mark(OFFENDINGLETTER));
		
		if (!analyzer01.mark(OFFENDINGLETTER).equals(MARKEDRESULT01)){
			System.out.println("Word mark Test: " + testCount + ": FAIL");
			failCount ++;
			
		} 
		else 
			System.out.println("Word mark Test: " + testCount + ": PASS");
		
		testCount ++;
		//System.out.print(WORDLISTRESULT01);
		System.out.print(WORDLISTRESULT01);
		System.out.print("\n-\n");
		System.out.print(analyzer01.allWordsWith(OFFENDINGLETTER));
		
		// some LipogramAnalyzer algorithms may add in a final \n to the list of words
		// that is OK, so setting up a test for this too
		// ignoring preceeding and trailing spaces to the word list 
		temp = WORDLISTRESULT01 + "\n";
		
		System.out.println("Compare: " + analyzer01.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT01.trim()));
		
		if (analyzer01.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT01.trim()) != 0
				&& analyzer01.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT01.trim()) != 0) {
		    System.out.println("Word list Test: " + testCount + ": FAIL");
		    failCount ++;
		} 
	
		else 
			System.out.println("Word list Test: " + testCount + ": PASS");
		
		
		
		
		// test 02
		System.out.println("*** NEW TEST STRING ***");
		System.out.println("Test String: " + TESTSAMPLE02);
		
		LipogramAnalyzer analyzer02 = new LipogramAnalyzer (TESTSAMPLE02.toLowerCase());
		
		testCount ++;
		
		System.out.println(MARKEDRESULT02 + " = " + analyzer02.mark(OFFENDINGLETTER));
		
		if (!analyzer02.mark(OFFENDINGLETTER).equals(MARKEDRESULT02)){
			System.out.println("Word mark Test: " + testCount + ": FAIL");
			failCount ++;
			
		} 
		else 
			System.out.println("Word mark Test: " + testCount + ": PASS");
		
		testCount ++;
		System.out.print(WORDLISTRESULT02);
		System.out.print("\n-\n");
		System.out.print(analyzer02.allWordsWith(OFFENDINGLETTER));
		
		// some LipogramAnalyzer algorithms may add in a final \n to the list of words
		// that is OK, so setting up a test for this too
		// ignoring preceeding and trailing spaces to the word list
		
		temp = WORDLISTRESULT02 + "\n";
		
		System.out.println("Compare: " + analyzer02.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT02.trim()));
		
		if (analyzer02.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT02.trim()) != 0
				&& analyzer02.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT02.trim()) != 0) {
		    System.out.println("Word list Test: " + testCount + ": FAIL");
		    failCount ++;
		} 
	
		else 
			System.out.println("Word list Test: " + testCount + ": PASS");
					
		// test 03
		System.out.println("*** NEW TEST STRING ***");
		System.out.println("Test String: " + TESTSAMPLE03);
		
		LipogramAnalyzer analyzer03 = new LipogramAnalyzer (TESTSAMPLE03.toLowerCase());
		
		testCount ++;
		
		System.out.println(MARKEDRESULT03 + " = " + analyzer03.mark(OFFENDINGLETTER));
		
		if (!analyzer03.mark(OFFENDINGLETTER).equals(MARKEDRESULT03)){
			System.out.println("Word mark Test: " + testCount + ": FAIL");
			failCount ++;
			
		} 
		else 
			System.out.println("Word mark Test: " + testCount + ": PASS");
		
		testCount ++;
		System.out.print(WORDLISTRESULT03);
		System.out.print("\n-\n");
		System.out.print(analyzer03.allWordsWith(OFFENDINGLETTER));
		
		// some LipogramAnalyzer algorithms may add in a final \n to the list of words
		// that is OK, so setting up a test for this too
		// ignoring preceeding and trailing spaces to the word list
		
		temp = WORDLISTRESULT03 + "\n";
		
		System.out.println("Compare: " + analyzer03.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT03.trim()));
		
		if ((analyzer03.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT03.trim()) != 0)
				&& (analyzer03.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT03.trim()) != 0)) {
		    System.out.println("Word list Test: " + testCount + ": FAIL");
		    failCount ++;
		} 
	
		else 
			System.out.println("Word list Test: " + testCount + ": PASS");
		
		
		// test 04
		System.out.println("*** NEW TEST STRING ***");
		System.out.println("Test String: " + TESTSAMPLE04);
		
		LipogramAnalyzer analyzer04 = new LipogramAnalyzer (TESTSAMPLE04.toLowerCase());
		
		testCount ++;
		
		System.out.println(MARKEDRESULT04 + " = " + analyzer04.mark(OFFENDINGLETTER));
		
		if (!analyzer04.mark(OFFENDINGLETTER).equals(MARKEDRESULT04)){
			System.out.println("Word mark Test: " + testCount + ": FAIL");
			failCount ++;
			
		} 
		else 
			System.out.println("Word mark Test: " + testCount + ": PASS");
		
		testCount ++;
		System.out.print(WORDLISTRESULT04);
		System.out.print("\n-\n");
		System.out.print(analyzer04.allWordsWith(OFFENDINGLETTER));
		
		// some LipogramAnalyzer algorithms may add in a final \n to the list of words
		// that is OK, so setting up a test for this too
		// ignoring preceeding and trailing spaces to the word list
		
		temp = WORDLISTRESULT04 + "\n";
		
		System.out.println("Compare: " + analyzer04.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT04.trim()));
		
		if ((analyzer04.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT04.trim()) != 0)
				&& (analyzer04.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT04.trim()) != 0)) {
		    System.out.println("Word list Test: " + testCount + ": FAIL");
		    failCount ++;
		} 
	
		else 
			System.out.println("Word list Test: " + testCount + ": PASS");	
		
		// test 05
		System.out.println("*** NEW TEST STRING ***");
		System.out.println("Test String: " + TESTSAMPLE05);
		
		LipogramAnalyzer analyzer05 = new LipogramAnalyzer (TESTSAMPLE05.toLowerCase());
		
		testCount ++;
		
		System.out.println(MARKEDRESULT05 + " = " + analyzer05.mark(OFFENDINGLETTER));
		
		if (!analyzer05.mark(OFFENDINGLETTER).equals(MARKEDRESULT05)){
			System.out.println("Word mark Test: " + testCount + ": FAIL");
			failCount ++;
			
		} 
		else 
			System.out.println("Word mark Test: " + testCount + ": PASS");
		
		testCount ++;
		System.out.print(WORDLISTRESULT05);
		System.out.print("\n-\n");
		System.out.print(analyzer05.allWordsWith(OFFENDINGLETTER));
		
		// some LipogramAnalyzer algorithms may add in a final \n to the list of words
		// that is OK, so setting up a test for this too
		// ignoring preceeding and trailing spaces to the word list
		
		temp = WORDLISTRESULT05 + "\n";
		
		System.out.println("Compare: " + analyzer05.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT05.trim()));
		
		if ((analyzer05.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT05.trim()) != 0)
				&& (analyzer05.allWordsWith(OFFENDINGLETTER).trim().compareTo(WORDLISTRESULT05.trim()) != 0)) {
		    System.out.println("Word list Test: " + testCount + ": FAIL");
		    failCount ++;
		} 
	
		else 
			System.out.println("Word list Test: " + testCount + ": PASS");		
		
		
		// test summary
		System.out.println();
		System.out.println("*****   TEST SUMMARY     *****");
		System.out.println("Tests:          " + testCount);
		System.out.println("Failed:         " + failCount);
		System.out.println("Total points:   " + TOTALPOINTS);
	
		percentPass = (double) (testCount - failCount) / testCount * 100;
		earnedPoints = percentPass * TOTALPOINTS / 100;
		System.out.println("Percent passed: " + Math.round(percentPass) + "%");
		System.out.println("Points earned:  " + Math.round(earnedPoints));
		
		
	}
		
}
