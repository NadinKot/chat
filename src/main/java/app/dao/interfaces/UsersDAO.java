package app.dao.interfaces;

import app.model.Users;

import javax.persistence.Id;
import java.util.List;

public interface UsersDAO extends GenericDAO<Users> {

	void deleteUsersByFullName(String name, String surname);

	List<Users> getAllUsersByFullName(String name, String surname);

	//List<Users> getUsersById(int id);
}
