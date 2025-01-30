//Author: Rithvik Muthyalapati
//Date: 4/3/19
//Version 2.0
//Version Notes:
//v.2.0: I added this epic header right here

public class DiplomaWithHonors extends Diploma {
	
	public DiplomaWithHonors(String name, String field) {
		super(name, field + "\n*** with honors ***");// This calls the superclass constructor
	}
}
