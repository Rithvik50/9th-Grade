//Author: Rithvik Muthyalapati
//Date: 4/3/19
//Version 2.0
//Version Notes:
//v.2.0: I added this epic header right here

public class DiplomaTester {
	
	public static void main(String[] args) {
		Diploma diploma1 = new Diploma("Murray Smith", "Gardening");
		System.out.println(diploma1);
		System.out.println();
		
		Diploma diploma2 = new DiplomaWithHonors("Lisa Smith", "Evolutionary Psychology");
		
		System.out.println(diploma2);
		System.out.println();
	}
}
