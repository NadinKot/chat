package app.model;

//import javax.persistence.*;
import java.io.Serializable;

import app.dao.interfaces.GenericDAO;
import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "USER_AUTH")
public class UserAuth implements Serializable {


	@Id
	@GeneratedValue
	private long id;

	@Column(name = "LOGIN" , nullable = false, unique = true)
	private String login;

	@Column(name = "PASSWORD")
	private String password;

	@OneToOne //(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="USER_ID")//(nullable=false)
	private Users user;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}


	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserAuth() {
	}

	public UserAuth(String login, String password) {
		this.login = login;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserAuth{" +
				"id=" + id +
				", login='" + login + '\'' +
				", password='" + password + '\'' +
				", user=" + user +
				'}';
	}
}