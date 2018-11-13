package app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
//import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "USERS")
@NamedQueries(
		@NamedQuery(name = "Users.getUsersByFilter", query = "SELECT user FROM Users user " +
				"WHERE LOWER(CONCAT(user.lastName, ' ', user.firstName)) LIKE LOWER(CONCAT('%', :filter, '%')) " +
				"OR LOWER(CONCAT(user.firstName, ' ', user.lastName)) LIKE LOWER(CONCAT('%', :filter, '%'))"))
public class Users implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;
	@Column(name = "TEL_NUMBER", nullable = false, unique = true)
	private String telNumber;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "BIRTHDAY")
	//@DateTimeFormat(pattern="dd/MM/yyyy") ///iso = DateTimeFormat.ISO.DATE
	//@Temporal(TemporalType.DATE)
	private Date birthday; // String
	@Column(name = "INFO")
	private String info;


	@OneToOne(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private UserAuth userAuth;


	public UserAuth getUserAuth() {
		return userAuth;
	}

	public void setUserAuth(UserAuth userAuth) {
		this.userAuth = userAuth;
		this.userAuth.setUser(this);
	}

	public Users() {
	}

	public Users(String firstName, String lastName, String email, String telNumber, String gender, Date birthday, String info) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telNumber = telNumber;
		this.gender = gender;
		this.birthday = birthday;
		this.info = info;
	}

	/* for main realization
	public Users(String firstName, String lastName, String email, String telNumber, String gender, Date birthday, String info, UserAuth userAuth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telNumber = telNumber;
		this.gender = gender;
		this.birthday = birthday;
		this.info = info;
		this.userAuth = userAuth;
		this.userAuth.setUser(this);
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/*public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}*/

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Users{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", telNumber='" + telNumber + '\'' +
				", gender='" + gender + '\'' +
				", birthday='" + birthday + '\'' +
				", info='" + info + '\'' +
				", userAuth=" + userAuth +
				'}';
	}
}
