//Author: Rithvik Muthyalapati
//Date: 4/3/19
//Version 2.0
//Version Notes:
//v.2.0: I added this epic header right here

public class Diploma {
	
	private String student;
	private String subject;
	
	public Diploma(String name, String field) {// Sets the name to student name and subject to the field
		student = name;
		subject = field;
	}
	
	public void setName(String newName) {// Sets new name
		student = newName;
	}
	
	public String getName() {// Returns the name
		return student;
	}
	
	public void setDiploma(String newDiploma) {// Sets new subject
		subject = newDiploma;
	}

	public String toString() {// Formats the diploma message
		return "This certifies that\n" + student + "\nhas completed a course in " + subject;
	}
}
