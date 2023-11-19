
/*

	This class tests the Diploma and DiplomaWithHonors classes. These classes should be related through inheritance.
	(A DiplomaWithHonors IS-A Diploma)

	Should display:



	This certifies that
	Murray Smith
	has completed a course in Gardening

	This certifies that
	Lisa Smith
	has completed a course in Evolutionary Psychology
	*** with honors ***

	This certifies that
	Goji Miyao
	has completed a course in Computer Engineering

	This certifies that
	James Hinds
	has completed a course in Theoretical Physics
	*** with honors ***



*/

public class DiplomaTest {

	public static void main (String[] args) {

		Diploma diploma1 = new Diploma("Murray Smith", "Gardening");
		System.out.println(diploma1);
		System.out.println();

		Diploma diploma2 = new DiplomaWithHonors("Lisa Smith", "Evolutionary Psychology");
		System.out.println(diploma2);
		System.out.println();

		Diploma diploma3 = new Diploma("Goji Miyao", "Computer Engineering");
		System.out.println(diploma3);
		System.out.println();

		Diploma diploma4 = new DiplomaWithHonors("James Hinds", "Theoretical Physics");
		System.out.println(diploma4);
		System.out.println();
		
		
		// Mr. Taylor's extra stuff experiment below
		
		System.out.println("getName diploma: " + diploma1.getName());
		diploma1.setName("new name");
		diploma1.setDiploma("fake new diploma");
		
		diploma2.setName("another new name");
		diploma2.setName("another fake diploma");
		
		System.out.println(diploma1);
		System.out.println();
		System.out.println(diploma2);

	}

}


