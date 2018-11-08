package app.DTO;

import java.sql.Date;

public class UserDTO {

	private String firstName;
	private String lastName;
	private String email;
	private String telNumber;


	public UserDTO() {
	}

	public UserDTO(String firstName, String lastName, String email, String telNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telNumber = telNumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}


}
