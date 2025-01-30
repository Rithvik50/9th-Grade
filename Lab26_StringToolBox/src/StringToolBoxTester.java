//Author: Rithvik Muthyalapati
//Date: 3/3/19
//Version 2.0
//Version Notes:
//v.2.0: I added this header
public class StringToolBoxTester {
	/*

	 This class tests all methods of the StringToolBox class.

	 To use this, comment out all methods that you haven't finished yet. Then
	 run - you should see the output on the left and right of all lines match!
	 

	*/

	
	public static void main(String[] args) {

	    StringToolBox stringTool = new StringToolBox();
	   
		
	    System.out.println("***Testing: String nameEcho(String s)***");
        System.out.println("Fred JONES = " + stringTool.nameEcho("Fred jones"));
        System.out.println("Prashant RAJ = " + stringTool.nameEcho("Prashant rAj"));
      
	    System.out.println("***Testing: boolean endsWithStar(String s)***");
		System.out.println("abcd* = " + stringTool.endsWithStar("abcd*"));
		System.out.println("djjdsj*dk = " + stringTool.endsWithStar("djjdsj*dk"));

		System.out.println("***Testing: boolean endsWithTwoStars(String s)***");
		System.out.println("abcd** = " + stringTool.endsWithTwoStars("abcd**"));
		System.out.println("* = " + stringTool.endsWithTwoStars("*"));
		System.out.println("false = " + stringTool.endsWithTwoStars(""));

		System.out.println("***Testing: String last4(String s)***");
		System.out.println("3456 = " + stringTool.last4("1234 5678 9012 3456"));

		System.out.println("***Testing: String last5(String s)***");
		System.out.println("23456 = " + stringTool.last5("1234 5678 9012 3456"));

		System.out.println("***Testing: String scroll(String s)***");
		System.out.println("23451 = " + stringTool.scroll("12345"));
		System.out.println("elloh = " + stringTool.scroll("hello"));

		System.out.println("***Testing: String convertName(String s)***");
		System.out.println("Albert Einstein = " + stringTool.convertName("Einstein, Albert"));
		System.out.println("Rithvik Muthyalapati = " + stringTool.convertName("Muthyalapati, Rithvik"));

		System.out.println("***Testing: String removeDashes(String s)***");
		System.out.println("987654321 = " + stringTool.removeDashes("987-65-4321"));
		System.out.println("22222222 = " + stringTool.removeDashes("22-22-22-22"));
		
		System.out.println("***Testing: String dateStr(String s)***");
		System.out.println("30-05-2004 = " + stringTool.dateStr("5/30/2004"));
		System.out.println("05-05-2004 = " + stringTool.dateStr("5/5/2004"));
		
		System.out.println("***Testing: String negativeBits(String s)***");
		System.out.println("01010 = " + stringTool.negativeBits(" 10101"));
		System.out.println("1011010 = " + stringTool.negativeBits("0100101"));
		
		System.out.println("***Testing: boolean containsSameChar(String s)***");
		System.out.println("aaaaaa = " + stringTool.containsSameChar("aaaaaa"));
		System.out.println("Aaaaaa = " + stringTool.containsSameChar("Aaaaaa"));
		System.out.println("111111 = " + stringTool.containsSameChar("111111"));
		
		System.out.println("***Testing: String removeComments(String s)***");
		System.out.println("Hello World = " + stringTool.removeComments("Hello /* big */ /* gigantic */ World"));
		System.out.println("Epic text goes here = " + stringTool.removeComments("Epic /* cool */ text goes here"));
		
		System.out.println("***Testing: String caesar(String s, int n)***");
		System.out.println("Mjqqt xnw = " + stringTool.caesar("Hello sir", 5));
		
		System.out.println("***Testing: boolean isPalindrome(String s)***");
		System.out.println("true = " + stringTool.isPalindrome("racecar"));
		
		System.out.println("***Testing: boolean validPassword(String s)***");
		System.out.println("false = " + stringTool.validPassword("Destinycr"));
	}

}
