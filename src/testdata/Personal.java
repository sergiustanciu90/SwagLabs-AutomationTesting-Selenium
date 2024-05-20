package testdata;

import utils.Reader;

public class Personal {
	private String firstName;
	private String lastName;
	private String postalCode;
	
	public Personal(String fileName) {
		this.firstName = Reader.json(fileName).get("firstname").toString();
		this.lastName = Reader.json(fileName).get("lastname").toString();
		this.postalCode = Reader.json(fileName).get("postalcode").toString();	
	
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	

}
