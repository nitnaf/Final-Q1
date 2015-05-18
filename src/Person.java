import java.util.UUID;


public class Person {
	private String fName;
	private String lName;
	private UUID personID;
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public UUID getPersonID() {
		return personID;
	}
	public void setPersonID() {
		this.personID = UUID.randomUUID();
	}

}
